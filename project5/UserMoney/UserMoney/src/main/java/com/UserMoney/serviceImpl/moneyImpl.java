package com.UserMoney.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.UserMoney.entity.money;
import com.UserMoney.repo.moneyrepo;
import com.UserMoney.service.moneyService;

@Service
public class moneyImpl implements moneyService {
	
	@Autowired
	private moneyrepo Moneyrepo;

	@Override
	public money createMoney(money Money) {
		// TODO Auto-generated method stub
		return Moneyrepo.save(Money);
	}

	@Override
	public List<money> getAll() {
		// TODO Auto-generated method stub
		return Moneyrepo.findAll();
	}

	@Override
	public money getByLockerId(String lockerId) {
		// TODO Auto-generated method stub
		return Moneyrepo.findById(lockerId).orElse(null);
	}

}
