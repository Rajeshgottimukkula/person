package com.example.Person.Service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.example.Person.Entity.Person;
import com.example.Person.Error.EmployeeNotFoundException;
import com.example.Person.Repo.PersonRepo;

import lombok.Builder;
import lombok.extern.log4j.Log4j2;
import com.example.Person.Entity.Person;
@Service
@Log4j2
@Builder
public class PersonService {

	
	
	
	@Autowired
	PersonRepo pr;

	public Person savePerson(Person person) {
		// TODO Auto-generated method stub
		return pr.save(person);
	}

	public Optional<Person> getPerson(String name) {

		Optional<Person> person = pr.findByPersonName(name);
		
		if (person.isEmpty())
			throw new EmployeeNotFoundException("Employee with Name " + name + " not found");

		return person;
		
		
	}

}
