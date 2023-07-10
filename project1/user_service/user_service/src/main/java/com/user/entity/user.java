package com.user.entity;
import java.util.ArrayList;
import java.util.List;

public class user {
	
	private Long userId;
	private String name;
	private String phone;
	
	List<contact> contacts= new ArrayList<>();
	
	//constructor using all feilds
	public user(Long userId, String name, String phone, List<contact> contacts) {
		super();
		this.userId = userId;
		this.name = name;
		this.phone = phone;
		this.contacts = contacts;
	}
	//constructor using all feilds except list

	public user(Long userId, String name, String phone) {
		super();
		this.userId = userId;
		this.name = name;
		this.phone = phone;
	}
	
	//no argument constructor
	public user() {
		super();
	}

	//	//getters setters
	public Long getUserId() {
		return userId;
	}

	public void setUserId(long userId) {
		this.userId = userId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public List<contact> getContacts() {
		return contacts;
	}

	public void  setContacts(List<contact> contacts) {
		this.contacts = contacts;
	}
	


	
	
	
	
	
	
	
	

}
