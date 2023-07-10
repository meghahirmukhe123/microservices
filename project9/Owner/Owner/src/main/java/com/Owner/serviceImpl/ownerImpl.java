package com.Owner.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Owner.entity.owner;
import com.Owner.repo.ownerRepo;
import com.Owner.service.ownerService;

@Service
public class ownerImpl implements ownerService {

	private final ownerRepo Ownerrepo;
	
	@Autowired
	private ownerImpl(ownerRepo Ownerrepo)
	{
		this.Ownerrepo=Ownerrepo;
	}
	
	
	@Override
	public owner creatData(owner Owner) {
		// TODO Auto-generated method stub
		return Ownerrepo.save(Owner);
	}

	@Override
	public List<owner> getAllOwners() {
		// TODO Auto-generated method stub
		return Ownerrepo.findAll();
	}

	@Override
	public List<owner> getByHouseId(String houseId) {
		// TODO Auto-generated method stub
		return Ownerrepo.findByhouseId(houseId);
	}

	@Override
	public List<owner> getbyRenterId(String renterId) {
		// TODO Auto-generated method stub
		return Ownerrepo.findByrenterId(renterId);
	}


	@Override
	public owner getByOwnerId(String ownerId) {
		// TODO Auto-generated method stub
		return Ownerrepo.findById(ownerId).orElseThrow(null);
	}

}
