package com.humber.week8;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EurekaRibbonServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekaRibbonServerApplication.class, args);
	}

}
