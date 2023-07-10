package com.UserMoney;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class UserMoneyApplication {

	public static void main(String[] args) {
		SpringApplication.run(UserMoneyApplication.class, args);
	}

}
