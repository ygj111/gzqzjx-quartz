package com.hhh.scheduler.domain;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the P_USER_ROLE database table.
 * 
 */
@Embeddable
public class PUserRolePK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="PERSON_ID")
	private String personId;

	@Column(name="ROLE_ID")
	private long roleId;

	public PUserRolePK() {
	}
	public String getPersonId() {
		return this.personId;
	}
	public void setPersonId(String personId) {
		this.personId = personId;
	}
	public long getRoleId() {
		return this.roleId;
	}
	public void setRoleId(long roleId) {
		this.roleId = roleId;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof PUserRolePK)) {
			return false;
		}
		PUserRolePK castOther = (PUserRolePK)other;
		return 
			this.personId.equals(castOther.personId)
			&& (this.roleId == castOther.roleId);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.personId.hashCode();
		hash = hash * prime + ((int) (this.roleId ^ (this.roleId >>> 32)));
		
		return hash;
	}
}