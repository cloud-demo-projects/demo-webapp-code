package com.example.demowebappcode;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DemoWebappCodeApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoWebappCodeApplication.class, args);
	}
	
	@GetMapping(value = "/")
	public String getText() {
		return "Welcome To Demo Webapp With Code";
	}

}
