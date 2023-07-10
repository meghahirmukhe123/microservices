package com.School.repo;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.ui.Model;

import com.School.entity.schoolinfo;

public interface schoolrepo extends MongoRepository<schoolinfo, String>{

}
