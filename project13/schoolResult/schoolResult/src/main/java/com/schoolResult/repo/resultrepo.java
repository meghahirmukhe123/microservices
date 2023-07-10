package com.schoolResult.repo;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.schoolResult.entity.schoolResult;

public interface resultrepo extends MongoRepository<schoolResult, String>
{

	List<schoolResult> findBystuId(String stuId);
	
	List<schoolResult> findByteacherId(String teacherId);
	
	List<schoolResult> findByschoolId(String schoolId);
}
