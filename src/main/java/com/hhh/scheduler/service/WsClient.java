package com.hhh.scheduler.service;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;

import javax.xml.bind.JAXBElement;
import javax.xml.datatype.XMLGregorianCalendar;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ws.client.core.support.WebServiceGatewaySupport;
import org.springframework.ws.soap.client.core.SoapActionCallback;

import com.hhh.scheduler.domain.BasEtp;
import com.hhh.scheduler.domain.BasEtpRepository;
import com.hhh.scheduler.domain.BasGc;
import com.hhh.scheduler.domain.BasGcRepository;
import com.hhh.scheduler.domain.BasLinkGcetp;
import com.hhh.scheduler.domain.BasLinkGcetpPK;
import com.hhh.scheduler.domain.BasLinkGcetpRepository;
import com.hhh.scheduler.domain.PUserRole;
import com.hhh.scheduler.domain.PUserRolePK;
import com.hhh.scheduler.domain.PUserRoleRepository;
import com.hhh.scheduler.domain.UserAuth;
import com.hhh.scheduler.domain.UserAuthRepository;
import com.hhh.webservice.gztd.ProjectBean2;
import com.hhh.webservice.gztd.ProjectForPage2;
import com.hhh.webservice.gztd.QueryProjectForPageToTD;
import com.hhh.webservice.gztd.QueryProjectForPageToTDResponse;
import com.hhh.webservice.gztd.QueryUnitList;
import com.hhh.webservice.gztd.QueryUnitListResponse;
import com.hhh.webservice.gztd.QueryUnitUserList;
import com.hhh.webservice.gztd.QueryUnitUserListResponse;
import com.hhh.webservice.gztd.UnitBean;
import com.hhh.webservice.gztd.UnitUserBean;

@Component
@Transactional
public class WsClient extends WebServiceGatewaySupport{
	@Autowired
	private BasGcRepository basGcRepository;
	@Autowired
	private BasEtpRepository basEtpRepository;
	@Autowired
	private UserAuthRepository userAuthRepository;
	@Autowired
	private PUserRoleRepository pUserRoleRepository;
	@Autowired
	private BasLinkGcetpRepository basLinkGcetpRepository;
	
	public  Date convertToDate(XMLGregorianCalendar cal) throws Exception{
        GregorianCalendar ca = cal.toGregorianCalendar();
        return ca.getTime();
    }
	
	/**
	 * 调用工程接口
	 * @param request
	 * @return
	 */
	public JAXBElement<QueryProjectForPageToTDResponse> invokeProjectWs(QueryProjectForPageToTD request){
		JAXBElement<QueryProjectForPageToTDResponse> response = (JAXBElement<QueryProjectForPageToTDResponse>) getWebServiceTemplate()
				.marshalSendAndReceive("http://192.168.3.64:8000/webservice/platformService",request,
						new SoapActionCallback("http://192.168.3.64:8000/webservice/QueryProjectForPageToTD"));
		return response;
	}
	
	/**
	 * 同步工程信息
	 * @return
	 */
	public void syncProjectInfo(){
		String updateStartDate = "2016-01-01";//更新开始日期
		String updateEndDate = "2016-06-01";//更新结束日期
		Integer thisPage = 1;//当前页数
		Integer pageSize = 10;//每页显示数
		QueryProjectForPageToTD request = new QueryProjectForPageToTD();
		request.setStartDate(updateStartDate);
		request.setEndDate(updateEndDate);
		request.setThisPage(thisPage);
		request.setPageSize(pageSize);

		JAXBElement<QueryProjectForPageToTDResponse> response = invokeProjectWs(request);
		ProjectForPage2 page = response.getValue().getReturn();
		System.out.println("projectCount:"+page.getPageCount());
		int pageNum = (int)Math.ceil((double)page.getPageCount() / pageSize);//总页数
		while(thisPage<=pageNum){
			request.setThisPage(thisPage);
			JAXBElement<QueryProjectForPageToTDResponse> response2 = invokeProjectWs(request);
			ProjectForPage2 page2 = response2.getValue().getReturn();
			List<ProjectBean2> projectList = page2.getProjectBean();
			BasGc basGc = null;
			BasLinkGcetp basLinkGcetp = null;
			BasLinkGcetpPK basLinkGcetpPK = null;
			for(ProjectBean2 p : projectList){
				//保存工程表
				basGc = new BasGc();
				basGc.setGcId(p.getProjectid());
				basGc.setCustomerId("0");
				basGc.setGcName(p.getProjectname());
				basGc.setGcCode(p.getProjectnumZl());
				basGc.setAqjdbm(p.getProjectcode());
				basGc.setGcAddress(p.getAddress());
				basGc.setJd(p.getProjectgpsx());
				basGc.setWd(p.getProjectgpsy());
				basGc.setTown("赣州市");
				basGc.setTowncode("360700");
				basGc.setCreatetime(new Timestamp(System.currentTimeMillis()));
				basGc.setCreatorId("100");
				basGc.setZljdzName("赣州市建筑行业安全管理监督站");
				basGc.setZljdzId("AJZ002");
				Timestamp startDate=null,endDate=null;
				try {
					if(p.getBegindate()!=null){
						startDate = new Timestamp(convertToDate(p.getBegindate()).getTime());
					}
					if(p.getEnddate()!=null){
						endDate = new Timestamp(convertToDate(p.getEnddate()).getTime());
					}
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				basGc.setStartdate(startDate);
				basGc.setEnddate(endDate);
				basGcRepository.save(basGc);
				
				//保存工程、企业中间表(BasLinkGcetp)
				basLinkGcetpPK = new BasLinkGcetpPK();
				basLinkGcetpPK.setGcId(p.getProjectid());
				basLinkGcetpPK.setEtpId(p.getConstructionerID());//施工单位
				basLinkGcetp = new BasLinkGcetp();
				basLinkGcetp.setId(basLinkGcetpPK);
				basLinkGcetp.setCustomerId("0");
				basLinkGcetp.setCreatetime(new Timestamp(System.currentTimeMillis()));
				basLinkGcetpRepository.save(basLinkGcetp);
				
				basLinkGcetpPK = new BasLinkGcetpPK();
				basLinkGcetpPK.setGcId(p.getProjectid());
				basLinkGcetpPK.setEtpId(p.getSupervisorID());//监理单位
				basLinkGcetp = new BasLinkGcetp();
				basLinkGcetp.setId(basLinkGcetpPK);
				basLinkGcetp.setCustomerId("0");
				basLinkGcetp.setCreatetime(new Timestamp(System.currentTimeMillis()));
				basLinkGcetpRepository.save(basLinkGcetp);
			}
			thisPage++;
		}
	}
	
	/**
	 * 同步企业信息
	 */
	public JAXBElement<QueryUnitListResponse> syncUnitInfo(){
		QueryUnitList request = new QueryUnitList();
		request.setBeginDate("2016-01-01");
		request.setEndDate("2016-06-01");
		
		JAXBElement<QueryUnitListResponse> response = (JAXBElement<QueryUnitListResponse>) getWebServiceTemplate()
				.marshalSendAndReceive("http://192.168.3.64:8000/webservice/platformService",request,
						new SoapActionCallback("http://192.168.3.64:8000/webservice/QueryUnitList"));
		List<UnitBean> unitBeanlist = response.getValue().getReturn();
		System.out.println("unitCount:"+unitBeanlist.size());
		BasEtp basEtp = null;
		for(UnitBean ub : unitBeanlist){
			basEtp = new BasEtp();
			basEtp.setEtpId(ub.getId());
			basEtp.setCustomerId(ub.getUnitid());
			basEtp.setUnitcode(ub.getUnitid());
			basEtp.setName(ub.getUnitname());
			basEtp.setLxr(ub.getContacts());
			if(ub.getUnittype().equals("7")){
				basEtp.setType("CT6");
				basEtpRepository.save(basEtp);
			}else if(ub.getUnittype().equals("8")){
				basEtp.setType("4");
				basEtpRepository.save(basEtp);
			}else if(ub.getUnittype().equals("10")){
				basEtp.setType("6");
				basEtpRepository.save(basEtp);
			}
		}
		return response;
	}
	
	/**
	 * 同步企业用户信息
	 */
	public JAXBElement<QueryUnitUserListResponse> syncUnitUserInfo(){
		QueryUnitUserList request = new QueryUnitUserList();
		request.setBeginDate("2016-01-01");
		request.setEndDate("2016-06-01");
		
		JAXBElement<QueryUnitUserListResponse> response = (JAXBElement<QueryUnitUserListResponse>) getWebServiceTemplate()
				.marshalSendAndReceive("http://192.168.3.64:8000/webservice/platformService",request,
						new SoapActionCallback("http://192.168.3.64:8000/webservice/queryUnitUserList"));
		List<UnitUserBean> list = response.getValue().getReturn();
		System.out.println("unitUserCount:"+list.size());
		UserAuth ua = null;
		PUserRole pur = null;
		PUserRolePK purPk = null;
		for(UnitUserBean bean : list){
			if(bean.getUsertype().equals("14")||bean.getUsertype().equals("22")||bean.getUsertype().equals("30")){
				ua = new UserAuth();
				ua.setPersonId(bean.getUsername());
				ua.setUserName(bean.getUsername());
				ua.setPassword(bean.getPassword());
				Timestamp updateDate=null;
				try {
					if(bean.getUpdatedate()!=null){
						updateDate = new Timestamp(convertToDate(bean.getUpdatedate()).getTime());
					}
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				ua.setVcdjrq(updateDate);
				ua.setState("Y");
				ua.setUsertype("units");
				ua.setUnitsid(bean.getUnitid());
				ua.setUserid(bean.getUserid());
				userAuthRepository.save(ua);
				
				pur = new PUserRole();
				purPk = new PUserRolePK();
				purPk.setPersonId(bean.getUsername());
				purPk.setRoleId(68);
				pur.setId(purPk);
				pur.setId2(new BigDecimal(0));
				pUserRoleRepository.save(pur);
			}
		}
		return response;
	}
}
