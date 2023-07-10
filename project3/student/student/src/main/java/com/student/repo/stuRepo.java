package com.student.repo;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.student.entity.studentClass;

public interface stuRepo extends MongoRepository<studentClass, String> {

}
