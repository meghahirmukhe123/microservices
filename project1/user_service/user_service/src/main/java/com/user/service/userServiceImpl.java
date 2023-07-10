package com.user.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.user.entity.user;

@Service

public class userServiceImpl implements userService {
	
	//fake user list.we can take this from database as well
	
	List<user> list= List.of(
			new user(101L,"megha","123451"),
			new user(102L,"anu","567891"),
			new user(103L,"tanu","101112"),
			new user(104L,"amnu","131415")
			
			);

	@Override
	public user getUser(Long id) {
		
		//if the userid is same as id give all info of that user
		return list.stream().filter(user->user.getUserId()==id).findAny().orElse(null);
	}

}
