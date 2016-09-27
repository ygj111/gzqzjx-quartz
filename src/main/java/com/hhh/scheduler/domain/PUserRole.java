package com.hhh.scheduler.domain;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the P_USER_ROLE database table.
 * 
 */
@Entity
@Table(name="P_USER_ROLE")
@NamedQuery(name="PUserRole.findAll", query="SELECT p FROM PUserRole p")
public class PUserRole implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private PUserRolePK id;
	
	@Column(name="id")
	private BigDecimal id2;

	public PUserRole() {
	}

	public PUserRolePK getId() {
		return this.id;
	}

	public void setId(PUserRolePK id) {
		this.id = id;
	}

	public BigDecimal getId2() {
		return id2;
	}

	public void setId2(BigDecimal id2) {
		this.id2 = id2;
	}

}