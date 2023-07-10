package com.bankuser.service;

import java.util.List;

import com.bankuser.entity.bankUser;

public interface bankUserService {
	
	//to create bank user
	bankUser createData(bankUser Bankuser);
	
	//get all user
	List<bankUser> getAllBankUsers();
	
	//get user by user id
	
	bankUser getUserByUserId(String uId);

}
