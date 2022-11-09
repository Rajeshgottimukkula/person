package com.example.Person.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Person.Entity.Person;
import com.example.Person.Repo.PersonRepo;
import com.example.Person.Service.PersonService;

@RestController
@RequestMapping("/persons")
public class PersonController {

	@Autowired
	PersonRepo repo;

	@Autowired
	PersonService ps;

	@PostMapping("/")
	public Person savePerson(@RequestBody Person person) {
		return ps.savePerson(person);
	}

	@GetMapping("/{name}")
	public Optional<Person> getPerson(@PathVariable("name") String name) {
		
		
		Optional<Person> person=ps.getPerson(name);
		return person;
	}

	@GetMapping("/name/{id}")
	public Optional<Person> getPersonById(@PathVariable int id) {
		Optional<Person> person = repo.findById(id);
		return person;

	}

	@GetMapping("/")
	public List<Person> getAllPersons() {
		return repo.findAll();
	}

}
