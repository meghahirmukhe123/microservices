package com.bankuser.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.bankuser.entity.bankUser;
import com.bankuser.service.bankUserService;

@RestController
public class bankUserController {
	
	@Autowired
	private bankUserService BankUserService;
	
	@PostMapping("/bankuser")
	public bankUser adddata(@RequestBody bankUser BankUser)
	{
		return BankUserService.createData(BankUser);
	}
	
	@GetMapping("/bankuser")
	public List<bankUser> getAll()
	{
		return BankUserService.getAllBankUsers();
	}
	
	@GetMapping("/bankuser/{uId}")
	public bankUser getbyid(@PathVariable String uId)
	{
		return BankUserService.getUserByUserId(uId);
	}

}
