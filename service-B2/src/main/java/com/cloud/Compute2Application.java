package com.cloud;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class Compute2Application {

	public static void main(String[] args) {
		new SpringApplicationBuilder(Compute2Application.class).web(true).run(args);
	}

}
