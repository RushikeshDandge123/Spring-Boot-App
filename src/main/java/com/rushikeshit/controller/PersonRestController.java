package com.rushikeshit.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rushikeshit.bindling.Person;

@RestController
public class PersonRestController {

<<<<<<< HEAD
	String Name;
=======
	Integer a = 10;
>>>>>>> 9e71c4a7db6a7c03538daa53286d37cefa36301c
	@GetMapping("/person")
	public Person getPerson() {
		
		Person p = new Person();
		p.setId(101);
		p.setName("Rishi Dandge");
		p.setGender("Male");
		p.setEmail("rishi@gmail.com");
		return p;
	}
}
