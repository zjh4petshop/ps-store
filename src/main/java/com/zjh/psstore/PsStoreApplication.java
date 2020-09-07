package com.zjh.psstore;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class PsStoreApplication {

	public static void main(String[] args) {
		SpringApplication.run(PsStoreApplication.class, args);
	}
}
