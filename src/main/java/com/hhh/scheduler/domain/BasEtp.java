package com.hhh.scheduler.domain;

import java.io.Serializable;
import javax.persistence.*;

import org.hibernate.annotations.GenericGenerator;

import java.sql.Timestamp;
import java.math.BigDecimal;


/**
 * The persistent class for the BAS_ETP database table.
 * 
 */
@Entity
@Table(name="BAS_ETP")
@NamedQuery(name="BasEtp.findAll", query="SELECT b FROM BasEtp b")
public class BasEtp implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(generator="idGenerator")
	@GenericGenerator(name="idGenerator", strategy="assigned")
	private String etpId;

	@Column(length=300)
	private String address;

	@Column(name="ADDRESS_LAB", length=300)
	private String addressLab;

	@Column(name="ADDRESS_PRODUCE", length=300)
	private String addressProduce;

	@Column(name="AUDIT_COMMENT", length=200)
	private String auditComment;

	@Column(name="AUDIT_STATUS", precision=2)
	private BigDecimal auditStatus;

	@Column(precision=29)
	private BigDecimal basedataid;

	@Column(name="BIZ_END_DATE")
	private Timestamp bizEndDate;

	@Column(name="BIZ_START_DATE")
	private Timestamp bizStartDate;

	@Column(name="BRANCH_ADDRESS", length=4000)
	private String branchAddress;

	@Column(name="BUSINESS_SCOPE", length=300)
	private String businessScope;

	@Column(length=15)
	private String capital;

	@Column(length=50)
	private String certification;

	@Column(name="CHECK_ITEMS_CODE", length=50)
	private String checkItemsCode;

	@Column(length=10)
	private String city;

	@Column(name="COMPUTE_END_DATE")
	private Timestamp computeEndDate;

	@Column(name="COMPUTE_NUM", length=50)
	private String computeNum;

	@Column(name="COMPUTE_START_DATE")
	private Timestamp computeStartDate;

	@Column(name="COUNT_DEVICE", length=10)
	private String countDevice;

	@Column(name="COUNT_RY", length=10)
	private String countRy;

	@Column(name="COUNT_RY_CJ", length=10)
	private String countRyCj;

	@Column(name="COUNT_RY_FGJ", length=10)
	private String countRyFgj;

	@Column(name="COUNT_RY_GJ", length=10)
	private String countRyGj;

	@Column(name="COUNT_RY_JC", length=10)
	private String countRyJc;

	@Column(name="COUNT_RY_QT", length=10)
	private String countRyQt;

	@Column(name="COUNT_RY_ZJ", length=10)
	private String countRyZj;

	@Column(name="COUNT_RY_ZY", length=10)
	private String countRyZy;

	@Column(length=20)
	private String cq;

	private Timestamp createtime;

	@Column(name="CREATOR_ID", length=10)
	private String creatorId;

	@Column(name="CUSTOMER_ID", length=50)
	private String customerId;

	@Column(name="DETECT_SCOPE", length=250)
	private String detectScope;

	@Column(name="ETP_CUSTOMER_ID", length=50)
	private String etpCustomerId;

	@Column(name="ETP_EMAIL", length=30)
	private String etpEmail;

	@Column(name="ETP_NAME_PARENT", length=100)
	private String etpNameParent;

	@Column(name="ETP_URL", length=50)
	private String etpUrl;

	@Column(name="ETPZZ_DJ_MAIN", length=50)
	private String etpzzDjMain;

	@Column(name="ETPZZ_END_DATE")
	private Timestamp etpzzEndDate;

	@Column(name="ETPZZ_ID_MAIN", length=36)
	private String etpzzIdMain;

	@Column(name="ETPZZ_MAIN", length=50)
	private String etpzzMain;

	@Column(name="ETPZZ_MAIN_CONTENT", length=4000)
	private String etpzzMainContent;

	@Column(name="ETPZZ_NUM_MAIN", length=50)
	private String etpzzNumMain;

	@Column(name="ETPZZ_START_DATE")
	private Timestamp etpzzStartDate;

	@Column(length=30)
	private String fax;

	@Column(length=20)
	private String frdb;

	@Column(name="FRDB_IDCARD", length=30)
	private String frdbIdcard;

	@Column(name="FRDB_PHONE", length=30)
	private String frdbPhone;

	@Column(name="FRDB_TEL", length=20)
	private String frdbTel;

	@Column(length=40)
	private String fzgrs;

	@Column(length=20)
	private String fzr;

	@Column(name="FZR_DUTY", length=50)
	private String fzrDuty;

	@Column(name="FZR_DUTY_NAME", length=50)
	private String fzrDutyName;

	@Column(name="FZR_PHONE", length=50)
	private String fzrPhone;

	@Column(name="FZR_SEX", length=1)
	private String fzrSex;

	@Column(name="FZR_TEL", length=20)
	private String fzrTel;

	@Column(length=40)
	private String gcsrs;

	@Column(length=600)
	private String introduction;

	@Column(length=40)
	private String jsyrs;

	private Timestamp lastupdate;

	@Column(length=50)
	private String license;

	@Column(length=20)
	private String lxr;

	@Column(name="LXR_PHONE", length=30)
	private String lxrPhone;

	@Column(name="LXR_TEL", length=20)
	private String lxrTel;

	@Column(name="MJ_BG", length=10)
	private String mjBg;

	@Column(name="MJ_FW", length=10)
	private String mjFw;

	@Column(name="MJ_SYS", length=10)
	private String mjSys;

	@Column(length=100)
	private String name;

	@Column(name="OUTPUT", length=15)
	private String output;

	@Column(name="POROMISE_REMARK", length=4000)
	private String poromiseRemark;

	@Column(length=10)
	private String province;

	private Timestamp regdate;

	@Column(length=200)
	private String remark;

	@Column(name="SAFE_LICENCE_CONTENT", length=4000)
	private String safeLicenceContent;

	@Column(name="SAFE_LICENCE_END_DATE")
	private Timestamp safeLicenceEndDate;

	@Column(name="SAFE_LICENCE_NUM", length=50)
	private String safeLicenceNum;

	@Column(name="SAFE_LICENCE_START_DATE")
	private Timestamp safeLicenceStartDate;

	@Column(length=30)
	private String shiyanshizr;

	@Column(length=30)
	private String shiyanshizrtel;

	@Column(length=20)
	private String status;

	@Column(length=20)
	private String stock;

	@Column(name="TEC_FZR", length=50)
	private String tecFzr;

	@Column(name="TEC_FZR_DUTY", length=50)
	private String tecFzrDuty;

	@Column(name="TEC_FZR_DUTY_NAME", length=50)
	private String tecFzrDutyName;

	@Column(name="TEC_FZR_PHONE", length=50)
	private String tecFzrPhone;

	@Column(name="TEC_FZR_SEX", length=1)
	private String tecFzrSex;

	@Column(name="TEC_FZR_TEL", length=50)
	private String tecFzrTel;

	@Column(length=20)
	private String town;

	@Column(name="TYPE", length=50)
	private String type;

	@Column(length=60)
	private String unitcode;

	@Column(name="ZIP_CODE", length=10)
	private String zipCode;

	@Column(length=40)
	private String zlgcsrs;

	@Column(length=30)
	private String zongjingli;

	@Column(length=30)
	private String zongjinglitel;

	public BasEtp() {
	}

	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getAddressLab() {
		return this.addressLab;
	}

	public void setAddressLab(String addressLab) {
		this.addressLab = addressLab;
	}

	public String getAddressProduce() {
		return this.addressProduce;
	}

	public void setAddressProduce(String addressProduce) {
		this.addressProduce = addressProduce;
	}

	public String getAuditComment() {
		return this.auditComment;
	}

	public void setAuditComment(String auditComment) {
		this.auditComment = auditComment;
	}

	public BigDecimal getAuditStatus() {
		return this.auditStatus;
	}

	public void setAuditStatus(BigDecimal auditStatus) {
		this.auditStatus = auditStatus;
	}

	public BigDecimal getBasedataid() {
		return this.basedataid;
	}

	public void setBasedataid(BigDecimal basedataid) {
		this.basedataid = basedataid;
	}

	public Timestamp getBizEndDate() {
		return this.bizEndDate;
	}

	public void setBizEndDate(Timestamp bizEndDate) {
		this.bizEndDate = bizEndDate;
	}

	public Timestamp getBizStartDate() {
		return this.bizStartDate;
	}

	public void setBizStartDate(Timestamp bizStartDate) {
		this.bizStartDate = bizStartDate;
	}

	public String getBranchAddress() {
		return this.branchAddress;
	}

	public void setBranchAddress(String branchAddress) {
		this.branchAddress = branchAddress;
	}

	public String getBusinessScope() {
		return this.businessScope;
	}

	public void setBusinessScope(String businessScope) {
		this.businessScope = businessScope;
	}

	public String getCapital() {
		return this.capital;
	}

	public void setCapital(String capital) {
		this.capital = capital;
	}

	public String getCertification() {
		return this.certification;
	}

	public void setCertification(String certification) {
		this.certification = certification;
	}

	public String getCheckItemsCode() {
		return this.checkItemsCode;
	}

	public void setCheckItemsCode(String checkItemsCode) {
		this.checkItemsCode = checkItemsCode;
	}

	public String getCity() {
		return this.city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public Timestamp getComputeEndDate() {
		return this.computeEndDate;
	}

	public void setComputeEndDate(Timestamp computeEndDate) {
		this.computeEndDate = computeEndDate;
	}

	public String getComputeNum() {
		return this.computeNum;
	}

	public void setComputeNum(String computeNum) {
		this.computeNum = computeNum;
	}

	public Timestamp getComputeStartDate() {
		return this.computeStartDate;
	}

	public void setComputeStartDate(Timestamp computeStartDate) {
		this.computeStartDate = computeStartDate;
	}

	public String getCountDevice() {
		return this.countDevice;
	}

	public void setCountDevice(String countDevice) {
		this.countDevice = countDevice;
	}

	public String getCountRy() {
		return this.countRy;
	}

	public void setCountRy(String countRy) {
		this.countRy = countRy;
	}

	public String getCountRyCj() {
		return this.countRyCj;
	}

	public void setCountRyCj(String countRyCj) {
		this.countRyCj = countRyCj;
	}

	public String getCountRyFgj() {
		return this.countRyFgj;
	}

	public void setCountRyFgj(String countRyFgj) {
		this.countRyFgj = countRyFgj;
	}

	public String getCountRyGj() {
		return this.countRyGj;
	}

	public void setCountRyGj(String countRyGj) {
		this.countRyGj = countRyGj;
	}

	public String getCountRyJc() {
		return this.countRyJc;
	}

	public void setCountRyJc(String countRyJc) {
		this.countRyJc = countRyJc;
	}

	public String getCountRyQt() {
		return this.countRyQt;
	}

	public void setCountRyQt(String countRyQt) {
		this.countRyQt = countRyQt;
	}

	public String getCountRyZj() {
		return this.countRyZj;
	}

	public void setCountRyZj(String countRyZj) {
		this.countRyZj = countRyZj;
	}

	public String getCountRyZy() {
		return this.countRyZy;
	}

	public void setCountRyZy(String countRyZy) {
		this.countRyZy = countRyZy;
	}

	public String getCq() {
		return this.cq;
	}

	public void setCq(String cq) {
		this.cq = cq;
	}

	public Timestamp getCreatetime() {
		return this.createtime;
	}

	public void setCreatetime(Timestamp createtime) {
		this.createtime = createtime;
	}

	public String getCreatorId() {
		return this.creatorId;
	}

	public void setCreatorId(String creatorId) {
		this.creatorId = creatorId;
	}

	public String getCustomerId() {
		return this.customerId;
	}

	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}

	public String getDetectScope() {
		return this.detectScope;
	}

	public void setDetectScope(String detectScope) {
		this.detectScope = detectScope;
	}

	public String getEtpCustomerId() {
		return this.etpCustomerId;
	}

	public void setEtpCustomerId(String etpCustomerId) {
		this.etpCustomerId = etpCustomerId;
	}

	public String getEtpEmail() {
		return this.etpEmail;
	}

	public void setEtpEmail(String etpEmail) {
		this.etpEmail = etpEmail;
	}

	public String getEtpId() {
		return this.etpId;
	}

	public void setEtpId(String etpId) {
		this.etpId = etpId;
	}

	public String getEtpNameParent() {
		return this.etpNameParent;
	}

	public void setEtpNameParent(String etpNameParent) {
		this.etpNameParent = etpNameParent;
	}

	public String getEtpUrl() {
		return this.etpUrl;
	}

	public void setEtpUrl(String etpUrl) {
		this.etpUrl = etpUrl;
	}

	public String getEtpzzDjMain() {
		return this.etpzzDjMain;
	}

	public void setEtpzzDjMain(String etpzzDjMain) {
		this.etpzzDjMain = etpzzDjMain;
	}

	public Timestamp getEtpzzEndDate() {
		return this.etpzzEndDate;
	}

	public void setEtpzzEndDate(Timestamp etpzzEndDate) {
		this.etpzzEndDate = etpzzEndDate;
	}

	public String getEtpzzIdMain() {
		return this.etpzzIdMain;
	}

	public void setEtpzzIdMain(String etpzzIdMain) {
		this.etpzzIdMain = etpzzIdMain;
	}

	public String getEtpzzMain() {
		return this.etpzzMain;
	}

	public void setEtpzzMain(String etpzzMain) {
		this.etpzzMain = etpzzMain;
	}

	public String getEtpzzMainContent() {
		return this.etpzzMainContent;
	}

	public void setEtpzzMainContent(String etpzzMainContent) {
		this.etpzzMainContent = etpzzMainContent;
	}

	public String getEtpzzNumMain() {
		return this.etpzzNumMain;
	}

	public void setEtpzzNumMain(String etpzzNumMain) {
		this.etpzzNumMain = etpzzNumMain;
	}

	public Timestamp getEtpzzStartDate() {
		return this.etpzzStartDate;
	}

	public void setEtpzzStartDate(Timestamp etpzzStartDate) {
		this.etpzzStartDate = etpzzStartDate;
	}

	public String getFax() {
		return this.fax;
	}

	public void setFax(String fax) {
		this.fax = fax;
	}

	public String getFrdb() {
		return this.frdb;
	}

	public void setFrdb(String frdb) {
		this.frdb = frdb;
	}

	public String getFrdbIdcard() {
		return this.frdbIdcard;
	}

	public void setFrdbIdcard(String frdbIdcard) {
		this.frdbIdcard = frdbIdcard;
	}

	public String getFrdbPhone() {
		return this.frdbPhone;
	}

	public void setFrdbPhone(String frdbPhone) {
		this.frdbPhone = frdbPhone;
	}

	public String getFrdbTel() {
		return this.frdbTel;
	}

	public void setFrdbTel(String frdbTel) {
		this.frdbTel = frdbTel;
	}

	public String getFzgrs() {
		return this.fzgrs;
	}

	public void setFzgrs(String fzgrs) {
		this.fzgrs = fzgrs;
	}

	public String getFzr() {
		return this.fzr;
	}

	public void setFzr(String fzr) {
		this.fzr = fzr;
	}

	public String getFzrDuty() {
		return this.fzrDuty;
	}

	public void setFzrDuty(String fzrDuty) {
		this.fzrDuty = fzrDuty;
	}

	public String getFzrDutyName() {
		return this.fzrDutyName;
	}

	public void setFzrDutyName(String fzrDutyName) {
		this.fzrDutyName = fzrDutyName;
	}

	public String getFzrPhone() {
		return this.fzrPhone;
	}

	public void setFzrPhone(String fzrPhone) {
		this.fzrPhone = fzrPhone;
	}

	public String getFzrSex() {
		return this.fzrSex;
	}

	public void setFzrSex(String fzrSex) {
		this.fzrSex = fzrSex;
	}

	public String getFzrTel() {
		return this.fzrTel;
	}

	public void setFzrTel(String fzrTel) {
		this.fzrTel = fzrTel;
	}

	public String getGcsrs() {
		return this.gcsrs;
	}

	public void setGcsrs(String gcsrs) {
		this.gcsrs = gcsrs;
	}

	public String getIntroduction() {
		return this.introduction;
	}

	public void setIntroduction(String introduction) {
		this.introduction = introduction;
	}

	public String getJsyrs() {
		return this.jsyrs;
	}

	public void setJsyrs(String jsyrs) {
		this.jsyrs = jsyrs;
	}

	public Timestamp getLastupdate() {
		return this.lastupdate;
	}

	public void setLastupdate(Timestamp lastupdate) {
		this.lastupdate = lastupdate;
	}

	public String getLicense() {
		return this.license;
	}

	public void setLicense(String license) {
		this.license = license;
	}

	public String getLxr() {
		return this.lxr;
	}

	public void setLxr(String lxr) {
		this.lxr = lxr;
	}

	public String getLxrPhone() {
		return this.lxrPhone;
	}

	public void setLxrPhone(String lxrPhone) {
		this.lxrPhone = lxrPhone;
	}

	public String getLxrTel() {
		return this.lxrTel;
	}

	public void setLxrTel(String lxrTel) {
		this.lxrTel = lxrTel;
	}

	public String getMjBg() {
		return this.mjBg;
	}

	public void setMjBg(String mjBg) {
		this.mjBg = mjBg;
	}

	public String getMjFw() {
		return this.mjFw;
	}

	public void setMjFw(String mjFw) {
		this.mjFw = mjFw;
	}

	public String getMjSys() {
		return this.mjSys;
	}

	public void setMjSys(String mjSys) {
		this.mjSys = mjSys;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getOutput() {
		return this.output;
	}

	public void setOutput(String output) {
		this.output = output;
	}

	public String getPoromiseRemark() {
		return this.poromiseRemark;
	}

	public void setPoromiseRemark(String poromiseRemark) {
		this.poromiseRemark = poromiseRemark;
	}

	public String getProvince() {
		return this.province;
	}

	public void setProvince(String province) {
		this.province = province;
	}

	public Timestamp getRegdate() {
		return this.regdate;
	}

	public void setRegdate(Timestamp regdate) {
		this.regdate = regdate;
	}

	public String getRemark() {
		return this.remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public String getSafeLicenceContent() {
		return this.safeLicenceContent;
	}

	public void setSafeLicenceContent(String safeLicenceContent) {
		this.safeLicenceContent = safeLicenceContent;
	}

	public Timestamp getSafeLicenceEndDate() {
		return this.safeLicenceEndDate;
	}

	public void setSafeLicenceEndDate(Timestamp safeLicenceEndDate) {
		this.safeLicenceEndDate = safeLicenceEndDate;
	}

	public String getSafeLicenceNum() {
		return this.safeLicenceNum;
	}

	public void setSafeLicenceNum(String safeLicenceNum) {
		this.safeLicenceNum = safeLicenceNum;
	}

	public Timestamp getSafeLicenceStartDate() {
		return this.safeLicenceStartDate;
	}

	public void setSafeLicenceStartDate(Timestamp safeLicenceStartDate) {
		this.safeLicenceStartDate = safeLicenceStartDate;
	}

	public String getShiyanshizr() {
		return this.shiyanshizr;
	}

	public void setShiyanshizr(String shiyanshizr) {
		this.shiyanshizr = shiyanshizr;
	}

	public String getShiyanshizrtel() {
		return this.shiyanshizrtel;
	}

	public void setShiyanshizrtel(String shiyanshizrtel) {
		this.shiyanshizrtel = shiyanshizrtel;
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getStock() {
		return this.stock;
	}

	public void setStock(String stock) {
		this.stock = stock;
	}

	public String getTecFzr() {
		return this.tecFzr;
	}

	public void setTecFzr(String tecFzr) {
		this.tecFzr = tecFzr;
	}

	public String getTecFzrDuty() {
		return this.tecFzrDuty;
	}

	public void setTecFzrDuty(String tecFzrDuty) {
		this.tecFzrDuty = tecFzrDuty;
	}

	public String getTecFzrDutyName() {
		return this.tecFzrDutyName;
	}

	public void setTecFzrDutyName(String tecFzrDutyName) {
		this.tecFzrDutyName = tecFzrDutyName;
	}

	public String getTecFzrPhone() {
		return this.tecFzrPhone;
	}

	public void setTecFzrPhone(String tecFzrPhone) {
		this.tecFzrPhone = tecFzrPhone;
	}

	public String getTecFzrSex() {
		return this.tecFzrSex;
	}

	public void setTecFzrSex(String tecFzrSex) {
		this.tecFzrSex = tecFzrSex;
	}

	public String getTecFzrTel() {
		return this.tecFzrTel;
	}

	public void setTecFzrTel(String tecFzrTel) {
		this.tecFzrTel = tecFzrTel;
	}

	public String getTown() {
		return this.town;
	}

	public void setTown(String town) {
		this.town = town;
	}

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getUnitcode() {
		return this.unitcode;
	}

	public void setUnitcode(String unitcode) {
		this.unitcode = unitcode;
	}

	public String getZipCode() {
		return this.zipCode;
	}

	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}

	public String getZlgcsrs() {
		return this.zlgcsrs;
	}

	public void setZlgcsrs(String zlgcsrs) {
		this.zlgcsrs = zlgcsrs;
	}

	public String getZongjingli() {
		return this.zongjingli;
	}

	public void setZongjingli(String zongjingli) {
		this.zongjingli = zongjingli;
	}

	public String getZongjinglitel() {
		return this.zongjinglitel;
	}

	public void setZongjinglitel(String zongjinglitel) {
		this.zongjinglitel = zongjinglitel;
	}

}