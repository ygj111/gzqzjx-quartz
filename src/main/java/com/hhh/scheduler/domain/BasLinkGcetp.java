package com.hhh.scheduler.domain;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;


/**
 * The persistent class for the BAS_LINK_GCETP database table.
 * 
 */
@Entity
@Table(name="BAS_LINK_GCETP")
@NamedQuery(name="BasLinkGcetp.findAll", query="SELECT b FROM BasLinkGcetp b")
public class BasLinkGcetp implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private BasLinkGcetpPK id;

	@Column(length=300)
	private String beizhu;

	@Column(nullable=false)
	private Timestamp createtime;

	@Column(name="CUSTOMER_ID", nullable=false, length=10)
	private String customerId;

	@Column(name="ETPZZ_ID", length=36)
	private String etpzzId;

	@Column(name="IS_MAIN", length=10)
	private String isMain;

	@Column(name="USER_ID", length=100)
	private String userId;

	public BasLinkGcetp() {
	}

	public BasLinkGcetpPK getId() {
		return this.id;
	}

	public void setId(BasLinkGcetpPK id) {
		this.id = id;
	}

	public String getBeizhu() {
		return this.beizhu;
	}

	public void setBeizhu(String beizhu) {
		this.beizhu = beizhu;
	}

	public Timestamp getCreatetime() {
		return this.createtime;
	}

	public void setCreatetime(Timestamp createtime) {
		this.createtime = createtime;
	}

	public String getCustomerId() {
		return this.customerId;
	}

	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}

	public String getEtpzzId() {
		return this.etpzzId;
	}

	public void setEtpzzId(String etpzzId) {
		this.etpzzId = etpzzId;
	}

	public String getIsMain() {
		return this.isMain;
	}

	public void setIsMain(String isMain) {
		this.isMain = isMain;
	}

	public String getUserId() {
		return this.userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

}