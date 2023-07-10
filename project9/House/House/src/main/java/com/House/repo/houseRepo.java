package com.House.repo;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.House.entity.house;

public interface houseRepo extends MongoRepository<house, String> {

}
