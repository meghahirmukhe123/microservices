package com.UserMoney.service;

import java.util.List;

import com.UserMoney.entity.money;

public interface moneyService {
	
	money createMoney(money Money);
	
	List<money> getAll();
	
	money getByLockerId(String lockerId);

}
