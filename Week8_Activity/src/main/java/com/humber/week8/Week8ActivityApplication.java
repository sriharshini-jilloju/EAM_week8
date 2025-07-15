package com.humber.week8;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class Week8ActivityApplication {

	public static void main(String[] args) {
		SpringApplication.run(Week8ActivityApplication.class, args);
	}

}
