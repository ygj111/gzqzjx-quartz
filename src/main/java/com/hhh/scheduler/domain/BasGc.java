package com.hhh.scheduler.domain;

import java.io.Serializable;
import javax.persistence.*;

import org.hibernate.annotations.GenericGenerator;

import java.sql.Timestamp;


/**
 * The persistent class for the BAS_GC database table.
 * 
 */
@Entity
@Table(name="BAS_GC")
@NamedQuery(name="BasGc.findAll", query="SELECT b FROM BasGc b")
public class BasGc implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(generator="idGenerator")
	@GenericGenerator(name="idGenerator", strategy="assigned")
	private String gcId;

	@Column(length=30)
	private String appname;

	@Column(length=50)
	private String aqjdbm;

	@Column(name="BD_HT", length=50)
	private String bdHt;

	@Column(name="BD_NAME", length=100)
	private String bdName;

	@Column(length=300)
	private String beizhu;

	@Column(name="BJ_AI", length=10)
	private String bjAi;

	@Column(name="BJ_DQ", length=10)
	private String bjDq;

	@Column(name="BJ_DTJ", length=10)
	private String bjDtj;

	@Column(name="BJ_ELEVATOR", length=10)
	private String bjElevator;

	@Column(name="BJ_GAS", length=10)
	private String bjGas;

	@Column(name="BJ_GJG", length=10)
	private String bjGjg;

	@Column(name="BJ_GZM", length=10)
	private String bjGzm;

	@Column(name="BJ_ID", length=36)
	private String bjId;

	@Column(name="BJ_JN", length=10)
	private String bjJn;

	@Column(name="BJ_MQ", length=10)
	private String bjMq;

	@Column(name="BJ_NT", length=10)
	private String bjNt;

	@Column(name="BJ_PS", length=10)
	private String bjPs;

	@Column(name="BJ_QT", length=10)
	private String bjQt;

	@Column(name="BJ_RF", length=10)
	private String bjRf;

	@Column(name="BJ_SJK", length=10)
	private String bjSjk;

	@Column(name="BJ_SNZS", length=10)
	private String bjSnzs;

	@Column(name="BJ_TF", length=10)
	private String bjTf;

	@Column(name="BJ_WJ", length=10)
	private String bjWj;

	@Column(name="BJ_XF", length=10)
	private String bjXf;

	@Column(name="BJ_YYL", length=10)
	private String bjYyl;

	@Column(name="BJ_ZJ", length=10)
	private String bjZj;

	@Column(length=30)
	private String city;

	@Column(length=20)
	private String citycode;

	@Column(name="COST_AZ", length=15)
	private String costAz;

	@Column(name="COST_MQ", length=15)
	private String costMq;

	@Column(name="COST_QT", length=15)
	private String costQt;

	@Column(name="COST_TJ", length=15)
	private String costTj;

	@Column(name="COST_TOTAL", length=15)
	private String costTotal;

	@Column(name="COST_ZJ", length=15)
	private String costZj;

	@Column(name="COST_ZX", length=15)
	private String costZx;

	@Column(nullable=false)
	private Timestamp createtime;

	@Column(name="CREATOR_CUSTOMER_ID", length=10)
	private String creatorCustomerId;

	@Column(name="CREATOR_ID", length=10)
	private String creatorId;

	@Column(name="CUSTOMER_ID", nullable=false, length=10)
	private String customerId;

	@Column(length=30)
	private String dijtype;

	@Column(name="DT_QJD", length=30)
	private String dtQjd;

	@Column(name="DT_QJD_L", length=10)
	private String dtQjdL;

	@Column(name="DT_QJD_W", length=10)
	private String dtQjdW;

	@Column(name="DT_ZD", length=30)
	private String dtZd;

	@Column(name="DT_ZDCS", length=10)
	private String dtZdcs;

	@Column(name="DT_ZDMJ", length=10)
	private String dtZdmj;

	private Timestamp enddate;

	@Column(name="FLOOR_DS", length=10)
	private String floorDs;

	@Column(name="FLOOR_DX", length=10)
	private String floorDx;

	@Column(name="FLOOR_YUE", length=10)
	private String floorYue;

	@Column(name="GC_ADDRESS", length=200)
	private String gcAddress;

	@Column(name="GC_CODE", length=50)
	private String gcCode;

	@Column(name="GC_JGCODE", length=50)
	private String gcJgcode;

	@Column(name="GC_NAME", length=200)
	private String gcName;

	@Column(length=20)
	private String gcgm;

	@Column(length=100)
	private String gcjd;

	@Column(length=100)
	private String gcnr;

	@Column(name="GPS_X", length=100)
	private String gpsX;

	@Column(name="GPS_Y", length=100)
	private String gpsY;

	@Column(name="GPS_Z", length=100)
	private String gpsZ;

	@Column(length=10)
	private String h;

	private Timestamp htgq;

	@Column(length=10)
	private String isbzf;

	@Column(length=10)
	private String isjien;

	@Column(length=10)
	private String ispoint;

	@Column(length=10)
	private String isyzc;

	@Column(name="ITEM_CODE", length=50)
	private String itemCode;

	@Column(name="ITEM_ID", length=36)
	private String itemId;

	@Column(name="ITEM_NAME", length=200)
	private String itemName;

	@Column(length=50)
	private String jd;

	@Column(length=30)
	private String jictype;

	@Column(name="JIEG_DS", length=20)
	private String jiegDs;

	@Column(name="JIEG_DX", length=20)
	private String jiegDx;

	@Column(length=20)
	private String jsxz;

	@Column(length=20)
	private String jzxz;

	@Column(length=10)
	private String kd;

	@Column(length=20)
	private String lxjb;

	@Column(length=50)
	private String lxnum;

	@Column(length=100)
	private String lxpzjg;

	@Column(name="MJ_DS", length=15)
	private String mjDs;

	@Column(name="MJ_DX", length=15)
	private String mjDx;

	@Column(name="MJ_FS", length=15)
	private String mjFs;

	@Column(name="MJ_JZ", length=15)
	private String mjJz;

	@Column(name="MJ_LH", length=15)
	private String mjLh;

	@Column(name="MJ_RF", length=15)
	private String mjRf;

	@Column(name="MJ_TOTAL", length=15)
	private String mjTotal;

	@Column(length=50)
	private String monitors;

	@Column(length=20)
	private String province;

	@Column(length=20)
	private String provincecode;

	@Column(name="PS_BG", length=10)
	private String psBg;

	@Column(name="PS_WSG", length=10)
	private String psWsg;

	@Column(name="PS_XH", length=10)
	private String psXh;

	@Column(name="PS_YSG", length=10)
	private String psYsg;

	private Timestamp pzkgdate;

	@Column(name="QIAO_H", length=10)
	private String qiaoH;

	@Column(name="QIAO_L", length=10)
	private String qiaoL;

	@Column(name="QIAO_W", length=10)
	private String qiaoW;

	private Timestamp sgxkdate;

	private Timestamp shdate;

	@Column(length=20)
	private String shman;

	@Column(name="SJK_COST", length=10)
	private String sjkCost;

	@Column(name="SJK_DEP", length=10)
	private String sjkDep;

	@Column(name="SJK_HDSNUM", length=50)
	private String sjkHdsnum;

	@Column(name="SJK_JPS", length=50)
	private String sjkJps;

	@Column(name="SJK_KW", length=10)
	private String sjkKw;

	@Column(name="SJK_MJ", length=10)
	private String sjkMj;

	@Column(name="SJK_ZHLX", length=50)
	private String sjkZhlx;

	@Column(name="SJK_ZHZ", length=50)
	private String sjkZhz;

	private Timestamp startdate;

	@Column(name="STATE", length=20)
	private String state;

	@Column(length=30)
	private String town;

	@Column(length=20)
	private String towncode;

	@Column(length=50)
	private String wd;

	@Column(length=20)
	private String zjly;

	@Column(length=50)
	private String zljdbm;

	@Column(name="ZLJDZ_ID", length=100)
	private String zljdzId;

	@Column(name="ZLJDZ_NAME", length=100)
	private String zljdzName;

	@Column(length=30)
	private String ztype;

	public BasGc() {
	}

	public String getAppname() {
		return this.appname;
	}

	public void setAppname(String appname) {
		this.appname = appname;
	}

	public String getAqjdbm() {
		return this.aqjdbm;
	}

	public void setAqjdbm(String aqjdbm) {
		this.aqjdbm = aqjdbm;
	}

	public String getBdHt() {
		return this.bdHt;
	}

	public void setBdHt(String bdHt) {
		this.bdHt = bdHt;
	}

	public String getBdName() {
		return this.bdName;
	}

	public void setBdName(String bdName) {
		this.bdName = bdName;
	}

	public String getBeizhu() {
		return this.beizhu;
	}

	public void setBeizhu(String beizhu) {
		this.beizhu = beizhu;
	}

	public String getBjAi() {
		return this.bjAi;
	}

	public void setBjAi(String bjAi) {
		this.bjAi = bjAi;
	}

	public String getBjDq() {
		return this.bjDq;
	}

	public void setBjDq(String bjDq) {
		this.bjDq = bjDq;
	}

	public String getBjDtj() {
		return this.bjDtj;
	}

	public void setBjDtj(String bjDtj) {
		this.bjDtj = bjDtj;
	}

	public String getBjElevator() {
		return this.bjElevator;
	}

	public void setBjElevator(String bjElevator) {
		this.bjElevator = bjElevator;
	}

	public String getBjGas() {
		return this.bjGas;
	}

	public void setBjGas(String bjGas) {
		this.bjGas = bjGas;
	}

	public String getBjGjg() {
		return this.bjGjg;
	}

	public void setBjGjg(String bjGjg) {
		this.bjGjg = bjGjg;
	}

	public String getBjGzm() {
		return this.bjGzm;
	}

	public void setBjGzm(String bjGzm) {
		this.bjGzm = bjGzm;
	}

	public String getBjId() {
		return this.bjId;
	}

	public void setBjId(String bjId) {
		this.bjId = bjId;
	}

	public String getBjJn() {
		return this.bjJn;
	}

	public void setBjJn(String bjJn) {
		this.bjJn = bjJn;
	}

	public String getBjMq() {
		return this.bjMq;
	}

	public void setBjMq(String bjMq) {
		this.bjMq = bjMq;
	}

	public String getBjNt() {
		return this.bjNt;
	}

	public void setBjNt(String bjNt) {
		this.bjNt = bjNt;
	}

	public String getBjPs() {
		return this.bjPs;
	}

	public void setBjPs(String bjPs) {
		this.bjPs = bjPs;
	}

	public String getBjQt() {
		return this.bjQt;
	}

	public void setBjQt(String bjQt) {
		this.bjQt = bjQt;
	}

	public String getBjRf() {
		return this.bjRf;
	}

	public void setBjRf(String bjRf) {
		this.bjRf = bjRf;
	}

	public String getBjSjk() {
		return this.bjSjk;
	}

	public void setBjSjk(String bjSjk) {
		this.bjSjk = bjSjk;
	}

	public String getBjSnzs() {
		return this.bjSnzs;
	}

	public void setBjSnzs(String bjSnzs) {
		this.bjSnzs = bjSnzs;
	}

	public String getBjTf() {
		return this.bjTf;
	}

	public void setBjTf(String bjTf) {
		this.bjTf = bjTf;
	}

	public String getBjWj() {
		return this.bjWj;
	}

	public void setBjWj(String bjWj) {
		this.bjWj = bjWj;
	}

	public String getBjXf() {
		return this.bjXf;
	}

	public void setBjXf(String bjXf) {
		this.bjXf = bjXf;
	}

	public String getBjYyl() {
		return this.bjYyl;
	}

	public void setBjYyl(String bjYyl) {
		this.bjYyl = bjYyl;
	}

	public String getBjZj() {
		return this.bjZj;
	}

	public void setBjZj(String bjZj) {
		this.bjZj = bjZj;
	}

	public String getCity() {
		return this.city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getCitycode() {
		return this.citycode;
	}

	public void setCitycode(String citycode) {
		this.citycode = citycode;
	}

	public String getCostAz() {
		return this.costAz;
	}

	public void setCostAz(String costAz) {
		this.costAz = costAz;
	}

	public String getCostMq() {
		return this.costMq;
	}

	public void setCostMq(String costMq) {
		this.costMq = costMq;
	}

	public String getCostQt() {
		return this.costQt;
	}

	public void setCostQt(String costQt) {
		this.costQt = costQt;
	}

	public String getCostTj() {
		return this.costTj;
	}

	public void setCostTj(String costTj) {
		this.costTj = costTj;
	}

	public String getCostTotal() {
		return this.costTotal;
	}

	public void setCostTotal(String costTotal) {
		this.costTotal = costTotal;
	}

	public String getCostZj() {
		return this.costZj;
	}

	public void setCostZj(String costZj) {
		this.costZj = costZj;
	}

	public String getCostZx() {
		return this.costZx;
	}

	public void setCostZx(String costZx) {
		this.costZx = costZx;
	}

	public Timestamp getCreatetime() {
		return this.createtime;
	}

	public void setCreatetime(Timestamp createtime) {
		this.createtime = createtime;
	}

	public String getCreatorCustomerId() {
		return this.creatorCustomerId;
	}

	public void setCreatorCustomerId(String creatorCustomerId) {
		this.creatorCustomerId = creatorCustomerId;
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

	public String getDijtype() {
		return this.dijtype;
	}

	public void setDijtype(String dijtype) {
		this.dijtype = dijtype;
	}

	public String getDtQjd() {
		return this.dtQjd;
	}

	public void setDtQjd(String dtQjd) {
		this.dtQjd = dtQjd;
	}

	public String getDtQjdL() {
		return this.dtQjdL;
	}

	public void setDtQjdL(String dtQjdL) {
		this.dtQjdL = dtQjdL;
	}

	public String getDtQjdW() {
		return this.dtQjdW;
	}

	public void setDtQjdW(String dtQjdW) {
		this.dtQjdW = dtQjdW;
	}

	public String getDtZd() {
		return this.dtZd;
	}

	public void setDtZd(String dtZd) {
		this.dtZd = dtZd;
	}

	public String getDtZdcs() {
		return this.dtZdcs;
	}

	public void setDtZdcs(String dtZdcs) {
		this.dtZdcs = dtZdcs;
	}

	public String getDtZdmj() {
		return this.dtZdmj;
	}

	public void setDtZdmj(String dtZdmj) {
		this.dtZdmj = dtZdmj;
	}

	public Timestamp getEnddate() {
		return this.enddate;
	}

	public void setEnddate(Timestamp enddate) {
		this.enddate = enddate;
	}

	public String getFloorDs() {
		return this.floorDs;
	}

	public void setFloorDs(String floorDs) {
		this.floorDs = floorDs;
	}

	public String getFloorDx() {
		return this.floorDx;
	}

	public void setFloorDx(String floorDx) {
		this.floorDx = floorDx;
	}

	public String getFloorYue() {
		return this.floorYue;
	}

	public void setFloorYue(String floorYue) {
		this.floorYue = floorYue;
	}

	public String getGcAddress() {
		return this.gcAddress;
	}

	public void setGcAddress(String gcAddress) {
		this.gcAddress = gcAddress;
	}

	public String getGcCode() {
		return this.gcCode;
	}

	public void setGcCode(String gcCode) {
		this.gcCode = gcCode;
	}

	public String getGcId() {
		return this.gcId;
	}

	public void setGcId(String gcId) {
		this.gcId = gcId;
	}

	public String getGcJgcode() {
		return this.gcJgcode;
	}

	public void setGcJgcode(String gcJgcode) {
		this.gcJgcode = gcJgcode;
	}

	public String getGcName() {
		return this.gcName;
	}

	public void setGcName(String gcName) {
		this.gcName = gcName;
	}

	public String getGcgm() {
		return this.gcgm;
	}

	public void setGcgm(String gcgm) {
		this.gcgm = gcgm;
	}

	public String getGcjd() {
		return this.gcjd;
	}

	public void setGcjd(String gcjd) {
		this.gcjd = gcjd;
	}

	public String getGcnr() {
		return this.gcnr;
	}

	public void setGcnr(String gcnr) {
		this.gcnr = gcnr;
	}

	public String getGpsX() {
		return this.gpsX;
	}

	public void setGpsX(String gpsX) {
		this.gpsX = gpsX;
	}

	public String getGpsY() {
		return this.gpsY;
	}

	public void setGpsY(String gpsY) {
		this.gpsY = gpsY;
	}

	public String getGpsZ() {
		return this.gpsZ;
	}

	public void setGpsZ(String gpsZ) {
		this.gpsZ = gpsZ;
	}

	public String getH() {
		return this.h;
	}

	public void setH(String h) {
		this.h = h;
	}

	public Timestamp getHtgq() {
		return this.htgq;
	}

	public void setHtgq(Timestamp htgq) {
		this.htgq = htgq;
	}

	public String getIsbzf() {
		return this.isbzf;
	}

	public void setIsbzf(String isbzf) {
		this.isbzf = isbzf;
	}

	public String getIsjien() {
		return this.isjien;
	}

	public void setIsjien(String isjien) {
		this.isjien = isjien;
	}

	public String getIspoint() {
		return this.ispoint;
	}

	public void setIspoint(String ispoint) {
		this.ispoint = ispoint;
	}

	public String getIsyzc() {
		return this.isyzc;
	}

	public void setIsyzc(String isyzc) {
		this.isyzc = isyzc;
	}

	public String getItemCode() {
		return this.itemCode;
	}

	public void setItemCode(String itemCode) {
		this.itemCode = itemCode;
	}

	public String getItemId() {
		return this.itemId;
	}

	public void setItemId(String itemId) {
		this.itemId = itemId;
	}

	public String getItemName() {
		return this.itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public String getJd() {
		return this.jd;
	}

	public void setJd(String jd) {
		this.jd = jd;
	}

	public String getJictype() {
		return this.jictype;
	}

	public void setJictype(String jictype) {
		this.jictype = jictype;
	}

	public String getJiegDs() {
		return this.jiegDs;
	}

	public void setJiegDs(String jiegDs) {
		this.jiegDs = jiegDs;
	}

	public String getJiegDx() {
		return this.jiegDx;
	}

	public void setJiegDx(String jiegDx) {
		this.jiegDx = jiegDx;
	}

	public String getJsxz() {
		return this.jsxz;
	}

	public void setJsxz(String jsxz) {
		this.jsxz = jsxz;
	}

	public String getJzxz() {
		return this.jzxz;
	}

	public void setJzxz(String jzxz) {
		this.jzxz = jzxz;
	}

	public String getKd() {
		return this.kd;
	}

	public void setKd(String kd) {
		this.kd = kd;
	}

	public String getLxjb() {
		return this.lxjb;
	}

	public void setLxjb(String lxjb) {
		this.lxjb = lxjb;
	}

	public String getLxnum() {
		return this.lxnum;
	}

	public void setLxnum(String lxnum) {
		this.lxnum = lxnum;
	}

	public String getLxpzjg() {
		return this.lxpzjg;
	}

	public void setLxpzjg(String lxpzjg) {
		this.lxpzjg = lxpzjg;
	}

	public String getMjDs() {
		return this.mjDs;
	}

	public void setMjDs(String mjDs) {
		this.mjDs = mjDs;
	}

	public String getMjDx() {
		return this.mjDx;
	}

	public void setMjDx(String mjDx) {
		this.mjDx = mjDx;
	}

	public String getMjFs() {
		return this.mjFs;
	}

	public void setMjFs(String mjFs) {
		this.mjFs = mjFs;
	}

	public String getMjJz() {
		return this.mjJz;
	}

	public void setMjJz(String mjJz) {
		this.mjJz = mjJz;
	}

	public String getMjLh() {
		return this.mjLh;
	}

	public void setMjLh(String mjLh) {
		this.mjLh = mjLh;
	}

	public String getMjRf() {
		return this.mjRf;
	}

	public void setMjRf(String mjRf) {
		this.mjRf = mjRf;
	}

	public String getMjTotal() {
		return this.mjTotal;
	}

	public void setMjTotal(String mjTotal) {
		this.mjTotal = mjTotal;
	}

	public String getMonitors() {
		return this.monitors;
	}

	public void setMonitors(String monitors) {
		this.monitors = monitors;
	}

	public String getProvince() {
		return this.province;
	}

	public void setProvince(String province) {
		this.province = province;
	}

	public String getProvincecode() {
		return this.provincecode;
	}

	public void setProvincecode(String provincecode) {
		this.provincecode = provincecode;
	}

	public String getPsBg() {
		return this.psBg;
	}

	public void setPsBg(String psBg) {
		this.psBg = psBg;
	}

	public String getPsWsg() {
		return this.psWsg;
	}

	public void setPsWsg(String psWsg) {
		this.psWsg = psWsg;
	}

	public String getPsXh() {
		return this.psXh;
	}

	public void setPsXh(String psXh) {
		this.psXh = psXh;
	}

	public String getPsYsg() {
		return this.psYsg;
	}

	public void setPsYsg(String psYsg) {
		this.psYsg = psYsg;
	}

	public Timestamp getPzkgdate() {
		return this.pzkgdate;
	}

	public void setPzkgdate(Timestamp pzkgdate) {
		this.pzkgdate = pzkgdate;
	}

	public String getQiaoH() {
		return this.qiaoH;
	}

	public void setQiaoH(String qiaoH) {
		this.qiaoH = qiaoH;
	}

	public String getQiaoL() {
		return this.qiaoL;
	}

	public void setQiaoL(String qiaoL) {
		this.qiaoL = qiaoL;
	}

	public String getQiaoW() {
		return this.qiaoW;
	}

	public void setQiaoW(String qiaoW) {
		this.qiaoW = qiaoW;
	}

	public Timestamp getSgxkdate() {
		return this.sgxkdate;
	}

	public void setSgxkdate(Timestamp sgxkdate) {
		this.sgxkdate = sgxkdate;
	}

	public Timestamp getShdate() {
		return this.shdate;
	}

	public void setShdate(Timestamp shdate) {
		this.shdate = shdate;
	}

	public String getShman() {
		return this.shman;
	}

	public void setShman(String shman) {
		this.shman = shman;
	}

	public String getSjkCost() {
		return this.sjkCost;
	}

	public void setSjkCost(String sjkCost) {
		this.sjkCost = sjkCost;
	}

	public String getSjkDep() {
		return this.sjkDep;
	}

	public void setSjkDep(String sjkDep) {
		this.sjkDep = sjkDep;
	}

	public String getSjkHdsnum() {
		return this.sjkHdsnum;
	}

	public void setSjkHdsnum(String sjkHdsnum) {
		this.sjkHdsnum = sjkHdsnum;
	}

	public String getSjkJps() {
		return this.sjkJps;
	}

	public void setSjkJps(String sjkJps) {
		this.sjkJps = sjkJps;
	}

	public String getSjkKw() {
		return this.sjkKw;
	}

	public void setSjkKw(String sjkKw) {
		this.sjkKw = sjkKw;
	}

	public String getSjkMj() {
		return this.sjkMj;
	}

	public void setSjkMj(String sjkMj) {
		this.sjkMj = sjkMj;
	}

	public String getSjkZhlx() {
		return this.sjkZhlx;
	}

	public void setSjkZhlx(String sjkZhlx) {
		this.sjkZhlx = sjkZhlx;
	}

	public String getSjkZhz() {
		return this.sjkZhz;
	}

	public void setSjkZhz(String sjkZhz) {
		this.sjkZhz = sjkZhz;
	}

	public Timestamp getStartdate() {
		return this.startdate;
	}

	public void setStartdate(Timestamp startdate) {
		this.startdate = startdate;
	}

	public String getState() {
		return this.state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getTown() {
		return this.town;
	}

	public void setTown(String town) {
		this.town = town;
	}

	public String getTowncode() {
		return this.towncode;
	}

	public void setTowncode(String towncode) {
		this.towncode = towncode;
	}

	public String getWd() {
		return this.wd;
	}

	public void setWd(String wd) {
		this.wd = wd;
	}

	public String getZjly() {
		return this.zjly;
	}

	public void setZjly(String zjly) {
		this.zjly = zjly;
	}

	public String getZljdbm() {
		return this.zljdbm;
	}

	public void setZljdbm(String zljdbm) {
		this.zljdbm = zljdbm;
	}

	public String getZljdzId() {
		return this.zljdzId;
	}

	public void setZljdzId(String zljdzId) {
		this.zljdzId = zljdzId;
	}

	public String getZljdzName() {
		return this.zljdzName;
	}

	public void setZljdzName(String zljdzName) {
		this.zljdzName = zljdzName;
	}

	public String getZtype() {
		return this.ztype;
	}

	public void setZtype(String ztype) {
		this.ztype = ztype;
	}

}