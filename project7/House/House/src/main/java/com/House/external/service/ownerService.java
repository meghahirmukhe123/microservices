package com.House.external.service;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.House.entity.owner;

@FeignClient(name ="OWNER-SERVICE" )
public interface ownerService {

	@GetMapping("/owner/houseId/{houseId}")
	List<owner> getOwner(@PathVariable String houseId);
}
