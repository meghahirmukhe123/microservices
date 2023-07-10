package com.Owner.repo;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.Owner.entity.owner;

public interface ownerRepo extends MongoRepository<owner, String>{

	List<owner> findByhouseId(String houseId);
	List<owner> findByrenterId(String renterId);
}
