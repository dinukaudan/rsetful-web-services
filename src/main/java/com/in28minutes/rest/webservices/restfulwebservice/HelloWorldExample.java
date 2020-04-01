package com.in28minutes.rest.webservices.restfulwebservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldExample {

	@GetMapping("/hello2")
	public String helloWOrldProgram() {
		return "Hello World";
	}
}
