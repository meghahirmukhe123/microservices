package com.Teacher.repo;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.Teacher.entity.teacherGrp;

public interface teacherRepo extends MongoRepository<teacherGrp, String>{

	
	List<teacherGrp> findByschoolId(String schoolId);
	
	List<teacherGrp> findBystuId(String stuId);
}
