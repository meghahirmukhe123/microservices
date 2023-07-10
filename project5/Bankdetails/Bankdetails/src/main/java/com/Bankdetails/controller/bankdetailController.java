package com.Bankdetails.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.Bankdetails.entity.bankdetail;
import com.Bankdetails.service.bankdetailservice;

@RestController
public class bankdetailController {
	@Autowired
	private bankdetailservice Bankservice;
	
	@PostMapping("/bankdetail")
	public bankdetail adddata(@RequestBody bankdetail bankdetail)
	{
		return Bankservice.createBankDetail(bankdetail);
	}
	
	@GetMapping("/bankdetail")
	public List<bankdetail> getAll()
	{
		return Bankservice.getAllDetail();
	}
	
	@GetMapping("/bankdetail/bankid/{bankId}")
	public List<bankdetail> getbybankid(@PathVariable String bankId)
	{
		return Bankservice.getBybankId(bankId);
	}
	
	@GetMapping("/bankdetail/uid/{uId}")
	public List<bankdetail> getbyuid(@PathVariable String uId)
	{
		return Bankservice.getByuId(uId);
	}
	
	@GetMapping("/bankdetail/useracid/{useracid}")
	public List<bankdetail> getbyuseracid(@PathVariable String useracid)
	{
		return Bankservice.getByuseracid(useracid);
	}


}
