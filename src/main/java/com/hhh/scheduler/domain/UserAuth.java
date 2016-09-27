package com.hhh.scheduler.domain;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;
import java.math.BigDecimal;


/**
 * The persistent class for the USER_AUTH database table.
 * 
 */
@Entity
@Table(name="USER_AUTH")
@NamedQuery(name="UserAuth.findAll", query="SELECT u FROM UserAuth u")
public class UserAuth implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="PERSON_ID")
	private String personId;

	private String company;

	private String companycode;

	private String deptid;

	private String duty;

	private String email;

	private String itemdeptid;

	@Column(name="JD_AQ")
	private String jdAq;

	@Column(name="JD_YL")
	private String jdYl;

	@Column(name="JD_ZL")
	private String jdZl;

	private BigDecimal kshoworder;

	private Timestamp lastlogintime;

	private String password;

	private String personpk;

	@Column(name="POWER")
	private String power;

	private String powername;

	private String projectpk;

	private String realname;

	private String regioncode;

	private String spbz;

	@Column(name="STATE")
	private String state;

	@Column(name="SUB_POW")
	private String subPow;

	private String unitsid;

	private Timestamp updatedate;

	@Column(name="USER_DEPT")
	private String userDept;

	@Column(name="USER_LEVEL")
	private String userLevel;

	@Column(name="USER_NAME")
	private String userName;

	private String userid;

	private String usertype;

	private String usertypesub;

	private BigDecimal ushoworder;

	private String vcdh;

	private Timestamp vcdjrq;

	private String vcdlks;

	private String vcdlks2;

	private String vcdwlx;

	private String vcgzlbl;

	private String vcqydm;

	private String vcsfzhm;

	private String vcsgzh;

	private String vcsj;

	private String vczc;

	private String vczy;

	public UserAuth() {
	}

	public String getPersonId() {
		return this.personId;
	}

	public void setPersonId(String personId) {
		this.personId = personId;
	}

	public String getCompany() {
		return this.company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getCompanycode() {
		return this.companycode;
	}

	public void setCompanycode(String companycode) {
		this.companycode = companycode;
	}

	public String getDeptid() {
		return this.deptid;
	}

	public void setDeptid(String deptid) {
		this.deptid = deptid;
	}

	public String getDuty() {
		return this.duty;
	}

	public void setDuty(String duty) {
		this.duty = duty;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getItemdeptid() {
		return this.itemdeptid;
	}

	public void setItemdeptid(String itemdeptid) {
		this.itemdeptid = itemdeptid;
	}

	public String getJdAq() {
		return this.jdAq;
	}

	public void setJdAq(String jdAq) {
		this.jdAq = jdAq;
	}

	public String getJdYl() {
		return this.jdYl;
	}

	public void setJdYl(String jdYl) {
		this.jdYl = jdYl;
	}

	public String getJdZl() {
		return this.jdZl;
	}

	public void setJdZl(String jdZl) {
		this.jdZl = jdZl;
	}

	public BigDecimal getKshoworder() {
		return this.kshoworder;
	}

	public void setKshoworder(BigDecimal kshoworder) {
		this.kshoworder = kshoworder;
	}

	public Timestamp getLastlogintime() {
		return this.lastlogintime;
	}

	public void setLastlogintime(Timestamp lastlogintime) {
		this.lastlogintime = lastlogintime;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getPersonpk() {
		return this.personpk;
	}

	public void setPersonpk(String personpk) {
		this.personpk = personpk;
	}

	public String getPower() {
		return this.power;
	}

	public void setPower(String power) {
		this.power = power;
	}

	public String getPowername() {
		return this.powername;
	}

	public void setPowername(String powername) {
		this.powername = powername;
	}

	public String getProjectpk() {
		return this.projectpk;
	}

	public void setProjectpk(String projectpk) {
		this.projectpk = projectpk;
	}

	public String getRealname() {
		return this.realname;
	}

	public void setRealname(String realname) {
		this.realname = realname;
	}

	public String getRegioncode() {
		return this.regioncode;
	}

	public void setRegioncode(String regioncode) {
		this.regioncode = regioncode;
	}

	public String getSpbz() {
		return this.spbz;
	}

	public void setSpbz(String spbz) {
		this.spbz = spbz;
	}

	public String getState() {
		return this.state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getSubPow() {
		return this.subPow;
	}

	public void setSubPow(String subPow) {
		this.subPow = subPow;
	}

	public String getUnitsid() {
		return this.unitsid;
	}

	public void setUnitsid(String unitsid) {
		this.unitsid = unitsid;
	}

	public Timestamp getUpdatedate() {
		return this.updatedate;
	}

	public void setUpdatedate(Timestamp updatedate) {
		this.updatedate = updatedate;
	}

	public String getUserDept() {
		return this.userDept;
	}

	public void setUserDept(String userDept) {
		this.userDept = userDept;
	}

	public String getUserLevel() {
		return this.userLevel;
	}

	public void setUserLevel(String userLevel) {
		this.userLevel = userLevel;
	}

	public String getUserName() {
		return this.userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserid() {
		return this.userid;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}

	public String getUsertype() {
		return this.usertype;
	}

	public void setUsertype(String usertype) {
		this.usertype = usertype;
	}

	public String getUsertypesub() {
		return this.usertypesub;
	}

	public void setUsertypesub(String usertypesub) {
		this.usertypesub = usertypesub;
	}

	public BigDecimal getUshoworder() {
		return this.ushoworder;
	}

	public void setUshoworder(BigDecimal ushoworder) {
		this.ushoworder = ushoworder;
	}

	public String getVcdh() {
		return this.vcdh;
	}

	public void setVcdh(String vcdh) {
		this.vcdh = vcdh;
	}

	public Timestamp getVcdjrq() {
		return this.vcdjrq;
	}

	public void setVcdjrq(Timestamp vcdjrq) {
		this.vcdjrq = vcdjrq;
	}

	public String getVcdlks() {
		return this.vcdlks;
	}

	public void setVcdlks(String vcdlks) {
		this.vcdlks = vcdlks;
	}

	public String getVcdlks2() {
		return this.vcdlks2;
	}

	public void setVcdlks2(String vcdlks2) {
		this.vcdlks2 = vcdlks2;
	}

	public String getVcdwlx() {
		return this.vcdwlx;
	}

	public void setVcdwlx(String vcdwlx) {
		this.vcdwlx = vcdwlx;
	}

	public String getVcgzlbl() {
		return this.vcgzlbl;
	}

	public void setVcgzlbl(String vcgzlbl) {
		this.vcgzlbl = vcgzlbl;
	}

	public String getVcqydm() {
		return this.vcqydm;
	}

	public void setVcqydm(String vcqydm) {
		this.vcqydm = vcqydm;
	}

	public String getVcsfzhm() {
		return this.vcsfzhm;
	}

	public void setVcsfzhm(String vcsfzhm) {
		this.vcsfzhm = vcsfzhm;
	}

	public String getVcsgzh() {
		return this.vcsgzh;
	}

	public void setVcsgzh(String vcsgzh) {
		this.vcsgzh = vcsgzh;
	}

	public String getVcsj() {
		return this.vcsj;
	}

	public void setVcsj(String vcsj) {
		this.vcsj = vcsj;
	}

	public String getVczc() {
		return this.vczc;
	}

	public void setVczc(String vczc) {
		this.vczc = vczc;
	}

	public String getVczy() {
		return this.vczy;
	}

	public void setVczy(String vczy) {
		this.vczy = vczy;
	}

}