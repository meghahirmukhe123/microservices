package com.Renter.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.Renter.entity.renter;
import com.Renter.service.renterService;

@RestController
public class renterController {
	
	@Autowired
	private renterService RenterService;
	
	@PostMapping("/renter")
	public renter savedata(@RequestBody renter Renter)
	{
		return RenterService.createData(Renter);
	}
	
	@GetMapping("/renter")
	public List<renter> getall()
	{
		return RenterService.getallRenters();
	}
	
	@GetMapping("/renter/renterid/{renterId}")
	public renter getbyrenterid(@PathVariable String renterId)
	{
		return RenterService.getByrenterId(renterId);
	}

}
