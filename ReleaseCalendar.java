package com.rahul.msr.domain;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class ReleaseCalendar implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -77939893619465384L;

	@Id
	private BigInteger id;
	
	private Date lastReleaseDate;
	private Date upcomingReleaseDate;
	private String applicationName;
	private BigInteger applicationId;
	private Date createdDate;
	
	public ReleaseCalendar() {
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

	public Date getLastReleaseDate() {
		return lastReleaseDate;
	}

	public void setLastReleaseDate(Date lastReleaseDate) {
		this.lastReleaseDate = lastReleaseDate;
	}

	public Date getUpcomingReleaseDate() {
		return upcomingReleaseDate;
	}

	public void setUpcomingReleaseDate(Date upcomingReleaseDate) {
		this.upcomingReleaseDate = upcomingReleaseDate;
	}

	public Date getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}
	
	
	
}
