package com.House.external.service;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.House.entity.owner;

@Service
@FeignClient(name ="OWNER-SERVICE" )
public interface ownerService {

	@GetMapping("/owner/houseId/{houseId}")
	List<owner> getOwner(@PathVariable String houseId);
	
	//to create owner data
		 @PostMapping("/owner")
		 //public owner createOwner(Map<String,Object> values) instead of this we have to write following
		 public owner createOwner(owner values);
		 
		 
		

	
}
