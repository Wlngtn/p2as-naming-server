package com.br.p2as;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class P2asNamingServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(P2asNamingServerApplication.class, args);
	}

}
