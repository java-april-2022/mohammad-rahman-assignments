package com.codingdojo.testproject;


// 2. Importing dependencies

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
// 1. Annotation
@RestController

public class TestprojectApplication {

	public static void main(String[] args) {
		SpringApplication.run(TestprojectApplication.class, args);
	}

        
        // 1. Annotation
        @RequestMapping("/")
        // 3. Method that maps to the request route above
        public String hello() { // 3
                return "Hello World!";
        }
        
        @RequestMapping("/peekaboo")
        public String peekaboo() {
        	return "Peekaboo!";
        }
        
}




