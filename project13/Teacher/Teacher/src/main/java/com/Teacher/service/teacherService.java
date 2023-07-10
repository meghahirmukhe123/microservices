package com.Teacher.service;

import java.util.List;
import java.util.Optional;

import com.Teacher.entity.teacherGrp;

public interface teacherService {

	
	//create data
	
	teacherGrp createData(teacherGrp TeacherGrp);
	
	//get all teacher grp data
	List<teacherGrp> getAllTeacherGrpData();
	
	//get by teacher id
	Optional<teacherGrp> getByTeacherId(String teacherGrpId);
	
	//get by school id
	List<teacherGrp> getBySchoolId(String schoolId);
	
	//get by student id
	List<teacherGrp> getByStudentId(String stuId);
	
}
