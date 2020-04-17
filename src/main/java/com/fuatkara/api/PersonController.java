package com.fuatkara.api;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fuatkara.model.Person;
import com.fuatkara.service.PersonService;

@RequestMapping(value="/api")
@RestController
public class PersonController {

	private final PersonService personService;

	@Autowired
	public PersonController(PersonService personService) {
		this.personService = personService;
	}

	//personService ama void olarak 
	//localhost:8080/api/v1/person
	//@PostMapping(value="/api/v1/person", produces=MediaType.APPLICATION_JSON_VALUE)
	@PostMapping(value="/v1/person")
	public void addPerson(@RequestBody Person person) {
		//Person sinifindada Json property olarak belirledik.
		personService.addPerson(person);
	}
	
	@GetMapping(value="/v1/person")
	public List<Person> getAllPeople(){
		return personService.getAllPeople();
	}
	
}