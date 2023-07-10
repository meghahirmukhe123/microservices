package com.House.controller;

import java.util.List;

import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.House.entity.house;
import com.House.service.houseService;

import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;

@RestController
public class houseController {
	 
	private final houseService HouseService;
	
	 @Autowired
	 public houseController(houseService HouseService) 
	 {
	        this.HouseService = HouseService;
	 }
	 
	 @PostMapping("/house")
	 public house savedata(@RequestBody house House)
	 {
		 return HouseService.createInfo(House);
	 }
	 @GetMapping("/house")
	 public List<house> getall()
	 {
		 return HouseService.getAllInfoOfHouse();
	 }
	 
	 //we are going to appply circuit breaker here bcoz this method is depend on another
	 //.getByHouseId method jya interface me present ahe tyach implementation class owner service vr depend aahe.
	 @GetMapping("/house/{houseId}")
	 @CircuitBreaker(name = "breaker",fallbackMethod = "breakerFallback")
	 public house getbyId(@PathVariable String houseId)
	 {
		 return HouseService.getByHouseId(houseId);
	 }

	 
	 //creaeting fallback method for circuit breaker
	 
	 public house breakerFallback( String houseId)
	 {
		 house House= house.builder()
				 .houseId("00000")
				 .lenNum("00000")
				 .rent(0)
				 .build();
		 
		 return House;
		 
	 }

}
