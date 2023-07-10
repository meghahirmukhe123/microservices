package com.Renter.repo;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.Renter.entity.renter;

public interface renterrepo extends MongoRepository<renter, String>{

}
