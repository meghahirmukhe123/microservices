package com.users.service;

import java.util.List;

import com.users.entity.myuser;

public interface myuserservice  {
	
	//create
	myuser saveusers(myuser Myuser);
	
	//get all user
	List<myuser> getallusers();
	
	//get by id
	myuser getuserbyid(String userId);

}
