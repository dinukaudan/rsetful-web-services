 package com.in28minutes.rest.webservices.restfulwebservice.controller;

import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.in28minutes.rest.webservices.restfulwebservice.service.HelloWorldBean;

@RestController
public class HelloWorldController {

	@Autowired
	private MessageSource MessageSource;
	
	
	
	@GetMapping(path ="/hello-world")
	public String helloWorldInternationalized(@RequestHeader("Accept-Language") Locale locale) {
		return MessageSource.getMessage("good.morning.message",null, locale);
	}
	
	
}
