package com.test.hotelsearch;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class HotelsearchApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(HotelsearchApplication.class, args);
	}

}
