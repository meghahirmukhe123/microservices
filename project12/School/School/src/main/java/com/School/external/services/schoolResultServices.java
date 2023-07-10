package com.School.external.services;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.School.entity.schoolResult;

@FeignClient(name = "SCHOOLRESULT-SERVICE")
public interface schoolResultServices {
	
	@GetMapping("/schoolResult/schoolId/{schoolId}")
	List<schoolResult> getAllResults(@PathVariable String schoolId);

}
