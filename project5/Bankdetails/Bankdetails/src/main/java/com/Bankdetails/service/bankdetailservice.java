package com.Bankdetails.service;

import java.util.List;

import com.Bankdetails.entity.bankdetail;

public interface bankdetailservice {
	
	//create
	bankdetail createBankDetail(bankdetail Bankdetail);
	
	List<bankdetail> getAllDetail();
	
	List<bankdetail> getByuId(String uId);
	
	List<bankdetail> getBybankId(String bankId);
	
	List<bankdetail> getByuseracid(String useracid);
	

}
