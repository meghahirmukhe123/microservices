package com.rating.repo;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.rating.entity.Rating;

public interface ratingrepo extends MongoRepository<Rating, String> {
	
	//custom finder method
	List<Rating> findByUserId(String userId);
	

}
