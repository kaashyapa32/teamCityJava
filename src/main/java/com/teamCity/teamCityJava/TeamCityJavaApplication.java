package com.teamCity.teamCityJava;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class TeamCityJavaApplication {

	public static void main(String[] args) {
		SpringApplication.run(TeamCityJavaApplication.class, args);
	}

	@GetMapping("/message")
	public String sayHello() {
		return "Hello TeamCity";
	}
}
