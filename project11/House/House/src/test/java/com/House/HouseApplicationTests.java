package com.House;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.House.entity.owner;
import com.House.external.service.ownerService;



@SpringBootTest
class HouseApplicationTests {

	@Test
	void contextLoads() {
		
		
	}
	@Autowired
	private ownerService OwnerService;

	@Test
	void createOwner()
	{
		owner o=owner.builder().houseId("123456").ownerName("megha D.H").renterId("345678").build();
		OwnerService.createOwner(o);
		
		System.out.println("new owner data added");
	}
}
