package com.Owner.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.Owner.entity.owner;
import com.Owner.service.ownerService;

@RestController
public class ownerController {
	
	private final ownerService Ownerservice;
	
	@Autowired
	private ownerController(ownerService Ownerservice)
	{
		this.Ownerservice=Ownerservice;
	}
	
	@PostMapping("/owner")
	public owner savedata(@RequestBody owner Owner)
	{
		return Ownerservice.creatData(Owner);
	}
	
	@GetMapping("/owner")
	public List<owner> getall()
	{
		return Ownerservice.getAllOwners();
	}
	
	@GetMapping("/owner/ownerId/{ownerId}")
	public owner getallbyownerid(@PathVariable String ownerId)
	{
		return Ownerservice.getByOwnerId(ownerId);
	}
	
	@GetMapping("/owner/houseId/{houseId}")
	public List<owner> getallbyHouseID(@PathVariable String houseId)
	{
		return Ownerservice.getByHouseId(houseId);
	}
	
	@GetMapping("/owner/renterId/{renterId}")
	public List<owner> getallbyRenterId(@PathVariable String renterId)
	{
		return Ownerservice.getbyRenterId(renterId);
	}


}
