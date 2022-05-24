package com.codingdojo.dojosandninjas.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.codingdojo.dojosandninjas.models.Dojo;
import com.codingdojo.dojosandninjas.models.Ninja;
import com.codingdojo.dojosandninjas.services.DojoService;
import com.codingdojo.dojosandninjas.services.NinjaService;

@Controller
public class MainController {
	
	// Services
	@Autowired
	private NinjaService ninjas;
	@Autowired
	private DojoService dojos;
	
	@GetMapping("/")
	public String landingPage() {
		return "redirect:/dojos/new";
	}
	
	@GetMapping("/dojos/new")
	public String newDojoForm(@ModelAttribute("dojo") Dojo dojo) {
		return "newDojoForm.jsp";
	}
	
	@GetMapping("/ninjas/new")
	public String newNinjaForm(@ModelAttribute("ninja") Ninja ninja, Model model) {
		model.addAttribute("dojos", dojos.allDojo());
		return "newNinjaForm.jsp";
	}
	
	@GetMapping("/dojos/{id}")
	public String showDojo(@PathVariable("id") Long id, Model model) {
		Dojo dojo = dojos.findDojo(id);
		model.addAttribute("dojo", dojo);
		return "showDojo.jsp";
	}
	
	@PostMapping("/dojos")
	public String createDojo(@ModelAttribute("dojo") Dojo dojo) {
		Dojo newDojo = dojos.createDojo(dojo);
		return String.format("redirect:/dojos/%s",newDojo.getId());
	}
	
	@PostMapping("/ninjas")
	public String createNinja(@ModelAttribute("ninja") Ninja ninja) {
		ninja = ninjas.createNinja(ninja);
		return "redirect:/dojos/" + ninja.getDojo().getId();
	}
	
}

