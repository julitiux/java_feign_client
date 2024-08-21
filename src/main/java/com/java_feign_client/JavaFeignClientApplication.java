package com.java_feign_client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class JavaFeignClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(JavaFeignClientApplication.class, args);
	}

}
