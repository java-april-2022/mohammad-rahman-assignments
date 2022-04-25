package com.codingdojo.omikuji.controllers;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {

	@GetMapping("/")
	public String index() {
		return "redirect:/omikuji";
	}
	
	@GetMapping("/omikuji")
	public String omikuji() {
		return "index.jsp";
	}

	@GetMapping("/omikuji/show")
	public String show(HttpSession session, Model model) {
		
		String output = (String) session.getAttribute("fortuneCookie");
		model.addAttribute("output", output);
		
		return "omikuji.jsp";
	}
	
	@PostMapping("/processForm")
	public String process(@RequestParam("number") int number, @RequestParam("city") String city, @RequestParam("person") String person, @RequestParam("hobby") String hobby, @RequestParam("animal") String animal, @RequestParam("comment") String comment, HttpSession session) {
		
		String fortuneCookie = String.format("In %s years, you will live in %s with %s as your roommate, %s. The next time you see a %s, you will have good luck. Also, %s.", number, city, person, hobby, animal, comment);
		
		session.setAttribute("fortuneCookie", fortuneCookie);
		
		return "redirect:/omikuji/show";
		
	}
}
