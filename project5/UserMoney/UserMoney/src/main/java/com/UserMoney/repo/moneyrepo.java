package com.UserMoney.repo;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.UserMoney.entity.money;

public interface moneyrepo extends MongoRepository<money, String> {

}
