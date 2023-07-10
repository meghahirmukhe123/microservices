package com.House.external.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.data.mongodb.core.aggregation.VariableOperators.Map;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.House.entity.owner;
import com.House.entity.renter;

@FeignClient(name = "RENTER-SERVICE")
public interface renterService {
	
	 @GetMapping("/renter/renterid/{renterId}")
	 renter getRenterById(@PathVariable String renterId);
	 
	 
}
