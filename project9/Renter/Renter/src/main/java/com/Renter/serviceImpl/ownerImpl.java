package com.Renter.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Renter.entity.renter;
import com.Renter.repo.renterrepo;
import com.Renter.service.renterService;

@Service
public class ownerImpl implements renterService {
	
	@Autowired
	private renterrepo Renterrepo;

	@Override
	public renter createData(renter Renter) {
		// TODO Auto-generated method stub
		return Renterrepo.save(Renter);
	}

	@Override
	public List<renter> getallRenters() {
		// TODO Auto-generated method stub
		return Renterrepo.findAll();
	}

	@Override
	public renter getByrenterId(String renterId) {
		// TODO Auto-generated method stub
		return Renterrepo.findById(renterId).orElseThrow(null);
	}

}
