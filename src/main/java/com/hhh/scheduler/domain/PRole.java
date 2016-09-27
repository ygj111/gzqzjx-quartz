package com.hhh.scheduler.domain;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the P_ROLE database table.
 * 
 */
@Entity
@Table(name="P_ROLE")
@NamedQuery(name="PRole.findAll", query="SELECT p FROM PRole p")
public class PRole implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;

	private String name;

	private BigDecimal ordernum;

	@Column(name="TYPE")
	private String type;

	public PRole() {
	}

	public long getId() {
		return this.id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public BigDecimal getOrdernum() {
		return this.ordernum;
	}

	public void setOrdernum(BigDecimal ordernum) {
		this.ordernum = ordernum;
	}

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}

}