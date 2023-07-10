package com.bankServiceRegistry;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class BankServiceRegistryApplication {

	public static void main(String[] args) {
		SpringApplication.run(BankServiceRegistryApplication.class, args);
	}

}
