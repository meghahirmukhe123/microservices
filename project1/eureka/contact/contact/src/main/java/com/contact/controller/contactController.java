package com.contact.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.contact.entity.contact;
import com.contact.service.contactService;

@RestController
@RequestMapping("/contact")
public class contactController {
	
	@Autowired
	private contactService ContactService;
	
	@GetMapping("/user/{userId}")
	public List<contact> getdata(@PathVariable long userId)
	{
		return this.ContactService.getAllContacts(userId);
	}

}
