package com.sgic.defect.employee.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "designation")
public class Designation_entity implements Serializable{
	private static final long serialVersionUID = 1L;

	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long designation_id;
	private String designation_name;
	private boolean approval;
	
	
	public Designation_entity() {
	}


	public Designation_entity(Long designation_id, String designation_name, boolean approval) {
		super();
		this.designation_id = designation_id;
		this.designation_name = designation_name;
		this.approval = approval;
	}


	public Long getDesignation_id() {
		return designation_id;
	}


	public void setDesignation_id(Long designation_id) {
		this.designation_id = designation_id;
	}


	public String getDesignation_name() {
		return designation_name;
	}


	public void setDesignation_name(String designation_name) {
		this.designation_name = designation_name;
	}


	public boolean isApproval() {
		return approval;
	}


	public void setApproval(boolean approval) {
		this.approval = approval;
	}


	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	

}