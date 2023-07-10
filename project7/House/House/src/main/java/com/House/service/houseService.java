package com.House.service;

import java.util.List;

import com.House.entity.house;

public interface houseService {
	//create house info
	house createInfo(house House);
	
	//get all info of house
	List<house> getAllInfoOfHouse();
	
	//get info by houseId
	house getByHouseId(String houseId);
	
	
	
	

}
