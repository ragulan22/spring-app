package com.qa.spring.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MathsController {
	
	@GetMapping("/hello")
	public void sayHello() {
		System.out.println("hello world");
	}
	
	@GetMapping("/hi2")
	public String sayHello1() {
		return "Hello world";
	}

	@GetMapping("/abc/{n1}/{n2}")
	public int addNumber(@PathVariable("n1")int num1,@PathVariable("n2")int num2) {
		return num1+num2;
	}
}
