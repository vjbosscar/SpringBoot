package com.springboot.springbootappln.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelControllerTest {
	
	@RequestMapping("/hello2")
	public String test(){
return "Welcome to spring boot";
}
	@GetMapping("/hello1")
	public String test1(@RequestParam String name,
			@RequestParam String prog){
return "Hello"+ name + ", Welcome to the course "+prog
		;
}
}