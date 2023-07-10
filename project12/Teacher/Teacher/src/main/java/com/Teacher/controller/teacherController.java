package com.Teacher.controller;

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

import com.Teacher.entity.teacherGrp;
import com.Teacher.service.teacherService;

import lombok.Getter;

@RestController
public class teacherController {
	
	@Autowired
	private teacherService TeacherService;
	
	@PostMapping("/teacherGrp")
	public ResponseEntity<teacherGrp> saveData(@RequestBody teacherGrp TeacherGrp)
	{
		teacherGrp t = TeacherService.createData(TeacherGrp);
		return ResponseEntity.status(HttpStatus.CREATED).body(t);
	}
	
	@GetMapping("/teacherGrp")
	public ResponseEntity<List<teacherGrp>> getAll()
	{
		return ResponseEntity.status(HttpStatus.OK).body(TeacherService.getAllTeacherGrpData());
	}
	
	@GetMapping("/teacherGrp/teacherId/{teacherGrpId}")
	public ResponseEntity<Optional<teacherGrp>> getbyid(@PathVariable String teacherGrpId)
	{
		return ResponseEntity.status(HttpStatus.OK).body(TeacherService.getByTeacherId(teacherGrpId));
	}
	
	@GetMapping("/teacherGrp/schoolId/{schoolId}")
	public ResponseEntity<List<teacherGrp>> getByschoolid(@PathVariable String schoolId)
	{
		return ResponseEntity.status(HttpStatus.OK).body(TeacherService.getBySchoolId(schoolId));
	}
	
	@GetMapping("/teacherGrp/studentId/{stuId}")
	public ResponseEntity<List<teacherGrp>> getbyStudentId(@PathVariable String stuId )
	{
		return ResponseEntity.status(HttpStatus.OK).body(TeacherService.getByStudentId(stuId));
	}

}
