package com.bankuser.serviceImpl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import javax.security.auth.login.AccountException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.bankuser.entity.bankDetails;
import com.bankuser.entity.bankUser;
import com.bankuser.entity.money;
import com.bankuser.entity.userAccount;
import com.bankuser.repo.bankuserrepo;
import com.bankuser.service.bankUserService;


@Service
public class bankUserServiceImpl implements bankUserService {
	
	@Autowired
	private bankuserrepo Bankuserrepo;
	
	@Autowired
	private RestTemplate restTemplate;
	
	private Logger logger=LoggerFactory.getLogger(bankUserServiceImpl.class);
	

	@Override
	public bankUser createData(bankUser Bankuser) {
		// TODO Auto-generated method stub
		return Bankuserrepo.save(Bankuser);
	}

	@Override
	public List<bankUser> getAllBankUsers() {
		// TODO Auto-generated method stub
		return Bankuserrepo.findAll();
	}

	
	//to get user of particular user id 
//	@Override
//	public bankUser getUserByUserId(String uId) {
//		// TODO Auto-generated method stub
//		return Bankuserrepo.findById(uId).orElseThrow(null);
//	}
	
	
	//bank user and bank details get connected
//	@Override
//	public bankUser getUserByUserId(String uId) {
//		bankUser Bank=Bankuserrepo.findById(uId).orElseThrow(null);
//		
//		//http://localhost:2003/bankdetail/uid/1   --> bank details by user id
//		ArrayList<bankDetails> bankdetailAns=restTemplate.getForObject("http://localhost:2003/bankdetail/uid/"+Bank.getuId(), ArrayList.class);
//		logger.info("{} ",bankdetailAns);
//		Bank.setBankDetails(bankdetailAns);
//		
//		
//		return Bank;
//	}

	
	//connecting bank user,bank details and user account
//	@Override
//	public bankUser getUserByUserId(String uId) {
//		bankUser Bank=Bankuserrepo.findById(uId).orElseThrow(null);
//		
//		//http://localhost:2003/bankdetail/uid/1   --> bank details by user id
//		bankDetails[] bankdetailAns=restTemplate.getForObject("http://localhost:2003/bankdetail/uid/"+Bank.getuId(), bankDetails[].class);
//		logger.info("{} ",bankdetailAns);
//		List<bankDetails> banks=Arrays.stream(bankdetailAns).toList();
//		
//		List<bankDetails> bankdetaillist= banks.stream().map(bank-> {
//			
//			//add user account data in bank details
//			//http://localhost:2002/userAc/userAccId/1b  -->get user account by user account id
//			ResponseEntity<userAccount> foreEntity=restTemplate.getForEntity("http://localhost:2002/userAc/userAccId/"+bank.getUseracid(), userAccount.class);
//			userAccount u=foreEntity.getBody();
//			bank.setUserAccount(u);
//			return bank;
//			
//		}).collect(Collectors.toList());
//		Bank.setBankDetails(bankdetaillist);
//		
//		
//		return Bank;
//	}
	

	
	//connecting bank user,bank details,user account,money service
	@Override
	public bankUser getUserByUserId(String uId) {
		bankUser Bank=Bankuserrepo.findById(uId).orElseThrow(null);
		
		//http://localhost:2003/bankdetail/uid/1   --> bank details by user id
		bankDetails[] bankdetailAns=restTemplate.getForObject("http://BANKDETAILS-SERVICE/bankdetail/uid/"+Bank.getuId(), bankDetails[].class);
		logger.info("{} ",bankdetailAns);
		List<bankDetails> banks=Arrays.stream(bankdetailAns).toList();
		
		
		List<bankDetails> bankdetaillist= banks.stream().map(bank-> {
			
			//adding user account data in bank details
			//http://localhost:2002/userAc/userAccId/1b  -->get user account by user account id
			ResponseEntity<userAccount> foreEntity=restTemplate.getForEntity("http://USERACCOUNT-SERVICE/userAc/userAccId/"+bank.getUseracid(), userAccount.class);
			userAccount u=foreEntity.getBody();
			bank.setUserAccount(u);
			
			
			if(u !=null)
			{
				ResponseEntity<money> monEntity =restTemplate.getForEntity("http://USERMONEY-SERVICE/money/lockerid/" + u.getLockerId(), money.class);
				money m2= monEntity.getBody();
				
				if(m2 != null)
				{
					//if money data of particular locker id is not empty store that user money data in user account
					u.setMoney(m2);
				}
			
			}
			return bank;
			
			
		}).collect(Collectors.toList());
		Bank.setBankDetails(bankdetaillist);
		
		
		return Bank;
	}
}
