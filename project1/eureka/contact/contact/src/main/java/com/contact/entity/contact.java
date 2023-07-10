package com.contact.entity;

public class contact {
	
	private long cId;
	private String email;
	private String contactName;
	
	private long userId;
	
	public contact(long cId,String email,String contactName,long userId)
	{
		this.cId=cId;
		this.email=email;
		this.contactName=contactName;
		this.userId=userId;
	}
	
	//default constructor
	public contact()
	{
		
	}

	//getters setters
	public long getcId() {
		return cId;
	}

	public void setcId(long cId) {
		this.cId = cId;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getContactName() {
		return contactName;
	}

	public void setContactName(String contactName) {
		this.contactName = contactName;
	}

	public long getUserId() {
		return userId;
	}

	public void setUserId(long userId) {
		this.userId = userId;
	}
	

}
