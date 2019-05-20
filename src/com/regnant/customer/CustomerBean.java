package com.regnant.customer;

public class CustomerBean {
	int customerId;
	String name;
	String age;
	String gender;
	String contact;
	String mailId;
	String Address;
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

	public void setAge(String age) {
		this.age = age;
	}

	public String getAge() {
		return age;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getGender() {
		return gender;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}

	public String getContact() {
		return contact;
	}

	public void setMailId(String mailId) {
		this.mailId = mailId;
	}

	public String getMailId() {
		return mailId;
	}

	public void setAddress(String Address) {
		this.Address = Address;
	}

	public String getAddress() {
		return Address;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getPassword() {
		return password;
	}

}
