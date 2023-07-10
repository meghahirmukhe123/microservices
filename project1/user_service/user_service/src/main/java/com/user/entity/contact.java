package com.user.entity;

public class contact {
	
	private Long cId;
	private String email;
	private String contactName;
	
	private Long userId;
	
	public contact(Long cId,String email,String contactName,Long userId)
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
	public Long getcId() {
		return cId;
	}

	public void setcId(Long cId) {
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

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}
	

}
