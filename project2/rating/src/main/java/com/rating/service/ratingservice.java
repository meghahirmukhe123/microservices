package com.rating.service;

import java.util.List;

import com.rating.entity.Rating;
import com.rating.repo.ratingrepo;

public interface ratingservice {
	
	//create
	
	Rating create(Rating rating);
	
	
	//get all rating
	List<Rating> getRatings();
	
	
	//get rating by userid
	List<Rating> getRatingsByUserid(String userId);

}
