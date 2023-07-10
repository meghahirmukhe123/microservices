package com.Renter.service;

import java.util.List;

import com.Renter.entity.renter;

public interface renterService {
	
	renter createData(renter Renter);
	
	List<renter> getallRenters();
	
	renter getByrenterId(String renterId);

}
