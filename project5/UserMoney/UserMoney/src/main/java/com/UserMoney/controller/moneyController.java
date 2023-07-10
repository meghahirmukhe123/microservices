package com.UserMoney.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.service.annotation.PutExchange;

import com.UserMoney.entity.money;
import com.UserMoney.service.moneyService;

@RestController
public class moneyController {
	@Autowired
	private moneyService MoneyService;
	
	@PostMapping("/money")
	public money savedata(@RequestBody money Money)
	{
		return MoneyService.createMoney(Money);
	}
	
	@GetMapping("/money")
	public List<money> getAllData()
	{
		return MoneyService.getAll();
	}
	
	@GetMapping("/money/lockerid/{lockerId}")
	public money getbylockerid(@PathVariable String lockerId)
	{
		return MoneyService.getByLockerId(lockerId);
	}
	
	
	
	
	

}
