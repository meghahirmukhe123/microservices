package com.StudentData.repo;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.StudentData.entity.student;

public interface studentrepo extends MongoRepository<student, String>{

	
	List<student> findByteachegrpId(String teachegrpId);
	
	List<student> findByresultId(String resultId);
	
	List<student> findByschoolId(String schoolId);
}
