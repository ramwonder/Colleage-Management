package com.example.CloudApiGatewayDepStu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class CloudApiGatewayDepStuApplication {

	public static void main(String[] args) {
		SpringApplication.run(CloudApiGatewayDepStuApplication.class, args);
	}

}
