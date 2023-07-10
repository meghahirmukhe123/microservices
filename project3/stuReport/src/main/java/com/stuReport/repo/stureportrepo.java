package com.stuReport.repo;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.stuReport.entity.stureport;

public interface stureportrepo extends MongoRepository<stureport, String> {

	List<stureport> findByStuId(String stuId);
}
