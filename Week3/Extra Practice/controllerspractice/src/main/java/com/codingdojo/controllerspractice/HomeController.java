package com.codingdojo.controllerspractice;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello") //handler class (class level)
public class HomeController {
	@RequestMapping("") //handler method (method level)
	public String hello() {
		return "Hello World!";
	}
	@RequestMapping("/world")
	public String world() {
		return "Class level annotations are cool too!";
	}
}
