package com.users.repo;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.users.entity.myuser;

public interface myuserrepo extends MongoRepository<myuser, String> {

}
