package com.example.Person.Entity;

import javax.persistence.Entity;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@JsonIgnoreProperties({"address"})
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Person {

	@Id
	private int id;
	private String personName;
	private int age;
	private String address;
//	public Person(int id, String name, int age, String address) {
//		super();
//		this.id = id;
//		personName = name;
//		this.age = age;
//		this.address = address;
//	}
//	public int getId() {
//		return id;
//	}
//	public void setId(int id) {
//		this.id = id;
//	}
//	public String getPersonName() {
//		return personName;
//	}
//	public void setPersonName(String name) {
//		personName = name;
//	}
//	public int getAge() {
//		return age;
//	}
//	public void setAge(int age) {
//		this.age = age;
//	}
//	public String getAddress() {
//		return address;
//	}
//	public void setAddress(String address) {
//		this.address = address;
//	}
//	public Person() {
//		super();
//		// TODO Auto-generated constructor stub
//	}
//	
}
