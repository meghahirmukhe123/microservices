package com.contact.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.contact.entity.contact;

@Service
public class contactServiceImpl implements contactService {
	
	//fake list of contact
	List<contact> list= List.of(  
			new contact(1L,"abc@gmail.com","abc",101L),
			new contact(2L,"def@gmail.com","def",102L),
			new contact(3L,"ghi@gmail.com","ghi",103L),
			new contact(4L,"jkl@gmail.com","jkl",104L)
			
			);
			
			

	@Override
	public List<contact> getAllContacts(long userId) {
		
		return list.stream().filter(contact->contact.getUserId()==userId).collect(Collectors.toList());
	}

}
