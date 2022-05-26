package com.codingdojo.dojosandninjastaketwo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.codingdojo.dojosandninjastaketwo.models.Dojo;
import com.codingdojo.dojosandninjastaketwo.models.Ninja;
import com.codingdojo.dojosandninjastaketwo.services.DojoService;
import com.codingdojo.dojosandninjastaketwo.services.NinjaService;

@Controller
public class MainController {

	@Autowired
	private DojoService dojos;
	@Autowired
	private NinjaService ninjas;
	
	@GetMapping("/")
	public String landingPage() {
		return "redirect:/dojos/new";
	}
	
	@GetMapping("/dojos/new")
	public String newDojo(@ModelAttribute("dojo") Dojo dojo) {
		return "newDojo.jsp";
	}
	
	@PostMapping("/newdojo")
	public String createDojo(@ModelAttribute("dojo") Dojo dojo) {
		Dojo newDojo = dojos.createDojo(dojo);
		return String.format("redirect:/dojos/%s", newDojo.getId());
	}
	
	@GetMapping("/dojos/{id}")
	public String displayDojo(@PathVariable("id") Long id, Model model) {
		Dojo dojo = dojos.findDojo(id);
		model.addAttribute("dojo", dojo);
		return "dojoDetails.jsp";
	}
	
	@GetMapping("/ninjas/new")
	public String newNinja(@ModelAttribute("ninja") Ninja ninja, Model model) {
		model.addAttribute("alldojos", dojos.allDojo());
		return "newNinja.jsp";
	}
	
	@PostMapping("/newninja")
	public String createNinja(@ModelAttribute("ninja") Ninja ninja) {
		ninja = ninjas.createNinja(ninja);
		return "redirect:/dojos/" + ninja.getDojo().getId();
	}
}
