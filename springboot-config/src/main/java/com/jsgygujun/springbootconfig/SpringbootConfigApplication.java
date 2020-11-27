package com.jsgygujun.springbootconfig;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.jsgygujun.springbootconfig.config", "com.jsgygujun.springbootconfig.controller"})
public class SpringbootConfigApplication {
	public static void main(String[] args) {
		SpringApplication.run(SpringbootConfigApplication.class, args);
	}
}
