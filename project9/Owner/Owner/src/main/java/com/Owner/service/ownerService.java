package com.Owner.service;

import java.util.List;

import com.Owner.entity.owner;

public interface ownerService {
	
	//create
	owner creatData(owner Owner);
	
	// get all
	List<owner> getAllOwners();
	
	//get by houseId
	List<owner> getByHouseId(String houseId);
	
	//get by renter id
	List<owner> getbyRenterId(String renterId);
	
	//get by owner id
	owner getByOwnerId(String ownerID);

}
