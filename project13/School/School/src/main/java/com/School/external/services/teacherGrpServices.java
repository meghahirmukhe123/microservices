package com.School.external.services;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.School.entity.teacherGrp;
import com.google.common.annotations.Beta;

@FeignClient(name = "TEACHER-SERVICE")
public interface teacherGrpServices {
	
	
	@GetMapping("/teacherGrp/schoolId/{schoolId}")
	List<teacherGrp> getAllTeacherGrp(@PathVariable String schoolId);

}
