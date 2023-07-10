package com.School.external.services;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.School.entity.student;

@FeignClient(name = "STUDENTDATA-SERVICE")
public interface studentServices {
	
	@GetMapping("/studata/stuId/{stuId}")
	student getAllStudents(@PathVariable String stuId);
	

}
