package com.StudentData.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.StudentData.entity.student;

import com.StudentData.service.studentData;

@RestController
public class studentController {
	@Autowired
	private studentData StudentData;
	
	@PostMapping("/studata")
	public ResponseEntity<student> savedata(@RequestBody student Student)
	{
		student stu = StudentData.createStudentData(Student);
		return ResponseEntity.status(HttpStatus.CREATED).body(stu);
	}
	
	@GetMapping("/studata")
	public ResponseEntity<List<student>> getall()
	{
		return ResponseEntity.status(HttpStatus.OK).body(StudentData.getAllStudentsData());
	}
	
	@GetMapping("/studata/stuId/{stuId}")
	public ResponseEntity<Optional<student>> getbystuid(@PathVariable String stuId )
	{
		return ResponseEntity.status(HttpStatus.OK).body(StudentData.getbyStuId(stuId));
	}
	
	@GetMapping("/studata/teachergrpid/{teachegrpId}")
	public ResponseEntity<List<student>> getbyteacherGrpid(@PathVariable String teachegrpId )
	{
		return ResponseEntity.status(HttpStatus.OK).body(StudentData.getbyTeacherGrpid(teachegrpId));
	}
	
	@GetMapping("/studata/resultid/{resultId}")
	public ResponseEntity<List<student>> getbyresultId(@PathVariable String resultId ) 
	{
		return ResponseEntity.status(HttpStatus.OK).body(StudentData.getbyResultId(resultId));
	}
	
	@GetMapping("/studata/schoolid/{schoolId}")
	public ResponseEntity<List<student>> getbyschoolId(@PathVariable String schoolId ) 
	{
		return ResponseEntity.status(HttpStatus.OK).body(StudentData.getbySchoolId(schoolId));
	}
	

}
