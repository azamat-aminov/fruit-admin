package com.tr.fruit_admin;

import de.codecentric.boot.admin.server.config.EnableAdminServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableAdminServer
@EnableScheduling
@EnableDiscoveryClient
public class FruitAdminApplication {

	public static void main(String[] args) {
		SpringApplication.run(FruitAdminApplication.class, args);
	}

}
