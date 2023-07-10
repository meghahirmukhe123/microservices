package com.House.external.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.House.entity.renter;

@FeignClient(name = "RENTER-SERVICE")
public interface renterService {
	
	 @GetMapping("/renter/renterid/{renterId}")
	 renter getRenterById(@PathVariable String renterId);

}
