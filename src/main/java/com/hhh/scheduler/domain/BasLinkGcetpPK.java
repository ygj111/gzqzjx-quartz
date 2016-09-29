package com.hhh.scheduler.domain;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the BAS_LINK_GCETP database table.
 * 
 */
@Embeddable
public class BasLinkGcetpPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="ETP_ID", unique=true, nullable=false, length=36)
	private String etpId;

	@Column(name="GC_ID", unique=true, nullable=false, length=36)
	private String gcId;

	public BasLinkGcetpPK() {
	}
	public String getEtpId() {
		return this.etpId;
	}
	public void setEtpId(String etpId) {
		this.etpId = etpId;
	}
	public String getGcId() {
		return this.gcId;
	}
	public void setGcId(String gcId) {
		this.gcId = gcId;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof BasLinkGcetpPK)) {
			return false;
		}
		BasLinkGcetpPK castOther = (BasLinkGcetpPK)other;
		return 
			this.etpId.equals(castOther.etpId)
			&& this.gcId.equals(castOther.gcId);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.etpId.hashCode();
		hash = hash * prime + this.gcId.hashCode();
		
		return hash;
	}
}