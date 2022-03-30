package com.infytel.configserver.infytelconfigserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class InfytelConfigserverApplication {

	public static void main(String[] args) {
		SpringApplication.run(InfytelConfigserverApplication.class, args);
	}

}
