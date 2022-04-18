package com.codingdojo.daikichiroutes;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/daikichi")
public class DaikichiController {

	@RequestMapping(value="")
	public String welcome() {
		return "Welcome!";
	}
	
	@RequestMapping(value="/today")
	public String today() {
		return "Today you will find luck in all your endeavors!";
	}
	
	@RequestMapping(value="/tomorrow")
	public String tomorrow() {
		return "Tomorrow, an opportunity will arise, so be sure to be open to new ideas!";
	}
	
	
	
	
	
}
