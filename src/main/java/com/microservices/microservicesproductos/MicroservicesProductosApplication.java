package com.microservices.microservicesproductos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class MicroservicesProductosApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroservicesProductosApplication.class, args);
	}

}
