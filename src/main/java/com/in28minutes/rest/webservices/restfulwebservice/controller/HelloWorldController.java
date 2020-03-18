 package com.in28minutes.rest.webservices.restfulwebservice.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.in28minutes.rest.webservices.restfulwebservice.service.HelloWorldBean;

@RestController
public class HelloWorldController {

	@GetMapping(path ="/hello-world")
	public String helloWorld() {
		return "Hello World";
	}
	
	
}
