package com.marks.repo;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.marks.entity.stumarks;

public interface markrepo extends MongoRepository<stumarks, String> {

}
