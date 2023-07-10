package com.student.repo;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.student.entity.stu;

public interface sturepo extends MongoRepository<stu, String> {

}
