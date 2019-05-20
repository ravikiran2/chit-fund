package com.regnant.organiser;

public class SchemeBean {
	int customerId;
	String name;
	String schemeType;
	String monthsPaid;
	String monthsPending;
	String status;
	String password;
	
	
	
	public void setId(int customerId) {
		this.customerId = customerId;
	}

	public int getId() {
		return customerId;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}
	public void setSchemeType(String schemeType) {
		this.schemeType = schemeType;
	}

	public String getSchemeType() {
		return schemeType;
	}
	public void setMonthsPaid(String monthsPaid) {
		this.monthsPaid = monthsPaid;
	}

	public String getMonthsPaid() {
		return monthsPaid;
	}
	public void setMonthsPending(String monthsPending) {
		this.monthsPending = monthsPending;
	}

	public String getMonthsPending() {
		return monthsPending;
	}
	public void setStatus(String status) {
		this.status = status;
	}

	public String getStatus() {
		return status;
	}
	public void setPassword(String password) {
		this.password = password;
	}

	public String getPassword() {
		return password;
	}
}
