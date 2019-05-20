package com.regnant.organiser;

public class CustomerBean {

	public int customerId;
	public String firstname;
	public String lastname;
	public String age;
	public String gender;
	public String contactno;
	public String mailID;
	public String address;
	public String SchemeType;

	public int getcustomerId() {
		return customerId;
	}

	public void setcustomerId(int Id) {
		this.customerId = Id;
	}

	public String getfirstname() {
		return firstname;
	}

	public void setfirstname(String name) {
		this.firstname = name;
	}

	public String getlastname() {
		return lastname;
	}

	public void setlastname(String name) {
		this.lastname = name;
	}

	public String getage() {
		return age;
	}

	public void setage(String age) {
		this.age = age;
	}

	public String getgender() {
		return gender;
	}

	public void setgender(String gender) {
		this.gender = gender;
	}

	public String getcontactno() {
		return contactno;
	}

	public void setcontactno(String contactno) {
		this.contactno = contactno;
	}

	public String getmailID() {
		return mailID;
	}

	public void setmailID(String mailID) {
		this.mailID = mailID;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getSchemeType() {
		return SchemeType;
	}

	public void setSchemeType(String SchemeType) {
		this.SchemeType = SchemeType;
	}

}
