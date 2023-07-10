package com.stuBio.repo;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.stuBio.entity.stuBio;

public interface biorepo extends MongoRepository<stuBio, String> {
	
	List<stuBio> findByStuId(String stuId);
	
	List<stuBio> findByResultid(String resultid);

}
