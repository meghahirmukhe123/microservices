package com.Bankdetails.repo;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.Bankdetails.entity.bankdetail;

public interface bankdetailsrepo extends MongoRepository<bankdetail, String>{

	List<bankdetail> findBybankId(String bankId);
	List<bankdetail> findByuId(String uId);
	List<bankdetail> findByuseracid(String useracid);
}
