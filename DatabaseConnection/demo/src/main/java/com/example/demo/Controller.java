package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

	// One syntax to implement a
	// GET method
	@GetMapping("/")
	public String home()
	{
		String str
			= "<html><body><font color=\"green\">"
			+ "<h1>DEMO SpringBoot APP</h1>"
			+ "</font></body></html>";
		return str;
	}

	// Another syntax to implement a
	// GET method
	@RequestMapping(
		method = { RequestMethod.GET },
		value = { "/example" })

	public String info()
	{
		String str2
			= "<html><body><font color=\"green\">"
			+ "<h2>Demo Program to setup basic springboot program"
			+ "</h2></font></body></html>";
		return str2;
	}
}
