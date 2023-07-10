package com.bankuser.repo;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.bankuser.entity.bankUser;

public interface bankuserrepo extends MongoRepository<bankUser, String> {

}
