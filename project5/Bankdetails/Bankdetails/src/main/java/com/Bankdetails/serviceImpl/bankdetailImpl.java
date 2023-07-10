package com.Bankdetails.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Bankdetails.entity.bankdetail;
import com.Bankdetails.repo.bankdetailsrepo;
import com.Bankdetails.service.bankdetailservice;

@Service
public class bankdetailImpl implements bankdetailservice {
	
	@Autowired
	private bankdetailsrepo Bankrepo;

	@Override
	public bankdetail createBankDetail(bankdetail Bankdetail) {
		// TODO Auto-generated method stub
		return Bankrepo.save(Bankdetail);
	}

	@Override
	public List<bankdetail> getAllDetail() {
		// TODO Auto-generated method stub
		return Bankrepo.findAll();
	}

	@Override
	public List<bankdetail> getByuId(String uId) {
		// TODO Auto-generated method stub
		return Bankrepo.findByuId(uId);
	}

	@Override
	public List<bankdetail> getBybankId(String bankId) {
		// TODO Auto-generated method stub
		return Bankrepo.findBybankId(bankId);
	}

	@Override
	public List<bankdetail> getByuseracid(String useracid) {
		// TODO Auto-generated method stub
		return Bankrepo.findByuseracid(useracid);
	}

}
