package com.stuBio.service;

import java.util.List;

import com.stuBio.entity.stuBio;

public interface bioservice {
	
	stuBio create(stuBio Stubio);
	
	List<stuBio> getStuBio();
	
	List<stuBio> getByStuId(String stuId);
	
	List<stuBio> getByResultId(String resultid);
	
	

}
