package com.contact.service;

import java.util.List;

import com.contact.entity.contact;

public interface contactService {
	
	//will pass id and following list will print all contacts related to that particular user
	
	public List<contact> getAllContacts(long userId);
	

}