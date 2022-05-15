package com.codingdojo.hellohuman;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HumanController {

	@RequestMapping("/")
	public String giveName(
			@RequestParam(value="first_name", required=false) String first_name,
			@RequestParam(value="last_name", required=false) String last_name
			) {
		String full_name;
		
		if(first_name == null && last_name == null) {
			full_name = "Human";
		}
		else if(first_name != null && last_name != null) {
			full_name = first_name + " " + last_name;
		}
		else {
			full_name = first_name == null ?
					"Esteemed Citizen " + last_name:
					"Esteemed Citizen " + first_name;
		}
		
		
		// explanation for the condensed IF-statement format
		// https://stackoverflow.com/questions/8898590/short-form-for-java-if-statement
		/*
		 if (city.getName() != null) {
    		name = city.getName();
		} else {
    		name="N/A";
		}
		 */
		 
		 // the above can be condensed to the following:
		 
		// name = ((city.getName() == null) ? "N/A" : city.getName());
		
		// in other words:
		
		// RESULT = IF_THIS_CONDITION_IS_TRUE ? THEN_THIS : ELSE_THAT;
		
		return String.format(
				"<a href='/'>Go Back</a>"
				+"<h1>Hello %s!</h1>"
				+"", full_name);
		 
		 
	}
		
	
	
}
