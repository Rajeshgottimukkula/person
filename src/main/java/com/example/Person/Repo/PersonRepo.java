package com.example.Person.Repo;

import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.Person.Entity.Person;

@Repository
public interface PersonRepo extends JpaRepository<Person,Integer>{
    
    @Transactional
	public Optional<Person> findByPersonName(String name);

}
