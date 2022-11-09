package com.example.Person.Service;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.Person.Repo.PersonRepo;
@SpringBootTest
class PersonServiceTest {

	@Test
	void test() {
		fail("Not yet implemented");
	}
	
	
	
	@Autowired
	PersonService ps;
	
	@Mock
	PersonRepo repo;
	
	//Mocking
	
	

	//Actual Mthod calling
	
	
	@Test
	public void when_valid_person_name() {
		String name="Rajesh";
		ps.getPerson(name);
		
	}
	
	
	//Assert

}
