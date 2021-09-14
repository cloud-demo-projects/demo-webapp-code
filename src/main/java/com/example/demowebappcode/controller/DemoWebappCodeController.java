package com.example.demowebappcode.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping(path = "/api/v1/")
public class DemoWebappCodeController {
	
	
	@GetMapping(value = "/text")
	public String getText() {
		return "Welcome To Demo Webapp With Code";
	}

}