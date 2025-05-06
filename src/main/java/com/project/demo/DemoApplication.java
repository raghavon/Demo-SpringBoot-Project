package com.project.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {

		SpringApplication.run(DemoApplication.class, args);
	}

}

// @springBootApplication by deafult hi @componentscan ko call karta hai jo hamare jitne bhi stereotype
// annotation hai unko identify karke alredy hi unke object bana leta hai jisse request aane per direct
// object ka use kr sake aur without inconvinence hum request ko uski mangi hui url pe bhej de
