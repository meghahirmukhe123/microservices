package com.schoolServiceRegistry;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class SchoolServiceRegistryApplication {

	public static void main(String[] args) {
		SpringApplication.run(SchoolServiceRegistryApplication.class, args);
	}

}
