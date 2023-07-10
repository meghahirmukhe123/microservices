package com.House.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.House.entity.house;
import com.House.service.houseService;

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
	 
	 @GetMapping("/house/{houseId}")
	 public house getbyId(@PathVariable String houseId)
	 {
		 return HouseService.getByHouseId(houseId);
	 }


}
