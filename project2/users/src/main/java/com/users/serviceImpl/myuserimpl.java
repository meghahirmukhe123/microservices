package com.users.serviceImpl;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.users.entity.Rating;
import com.users.entity.myuser;
import com.users.repo.myuserrepo;
import com.users.service.myuserservice;

@Service

public class myuserimpl implements myuserservice{
	
	@Autowired
	private myuserrepo Myuserrepo;
	
	@Autowired
	private RestTemplate restTemplate;
	
	private Logger logger=LoggerFactory.getLogger(myuserimpl.class);
	
	

	@Override
	public myuser saveusers(myuser Myuser) {
		
		return Myuserrepo.save(Myuser); 
	}

	@Override
	public List<myuser> getallusers() {
		
		return Myuserrepo.findAll();
	}

	@Override
	public myuser getuserbyid(String userId) {
		
		//get user from database by user id
		myuser user=Myuserrepo.findById(userId).orElseThrow(null);
		
		//fetch rating of above user from rating service
		//http://localhost:8082/rating/user/3
		
		ArrayList<Rating> ratingsOfUser=restTemplate.getForObject("http://localhost:8082/rating/user/"+user.getUserId(), ArrayList.class);
		logger.info("{} ",ratingsOfUser);
		user.setRatings(ratingsOfUser);
		
		
		
		
		return user;
	}

}
