package com.rahul.msr.domain;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Issues implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -817878378758404785L;

	@Id
	private BigInteger id;
	
	private String issue;
	private String applicationName;
	private BigInteger applicationId;
	private Date createdDate;
	
	public Issues() {
		// TODO Auto-generated constructor stub
	}

	public BigInteger getId() {
		return id;
	}

	public void setId(BigInteger id) {
		this.id = id;
	}
	

	public String getApplicationName() {
		return applicationName;
	}

	public void setApplicationName(String applicationName) {
		this.applicationName = applicationName;
	}

	public BigInteger getApplicationId() {
		return applicationId;
	}

	public void setApplicationId(BigInteger applicationId) {
		this.applicationId = applicationId;
	}

	public String getIssue() {
		return issue;
	}

	public void setIssue(String issue) {
		this.issue = issue;
	}

	public Date getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}
	
	
	
}
