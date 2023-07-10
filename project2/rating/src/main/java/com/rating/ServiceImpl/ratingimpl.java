package com.rating.ServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rating.entity.Rating;
import com.rating.repo.ratingrepo;
import com.rating.service.ratingservice;


@Service
public class ratingimpl implements ratingservice {
	
	@Autowired
	private ratingrepo Ratingrepo;

	@Override
	public Rating create(Rating rating) {
		
		return Ratingrepo.save(rating);
	}

	@Override
	public List<Rating> getRatings() {
		
		return Ratingrepo.findAll();
	}

	@Override
	public List<Rating> getRatingsByUserid(String userId) {
		
		return Ratingrepo.findByUserId(userId);
	}

}
