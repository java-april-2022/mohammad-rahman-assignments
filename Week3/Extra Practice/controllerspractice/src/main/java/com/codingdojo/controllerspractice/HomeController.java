package com.codingdojo.controllerspractice;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
	@RequestMapping("/") //handler method (method level)
	public String hello() {
		return "Hello World!";
	}
}
