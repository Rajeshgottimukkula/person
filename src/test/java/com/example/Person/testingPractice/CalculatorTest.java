package com.example.Person.testingPractice;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CalculatorTest {
//
//	@Test
//	void test() {
//		fail("Not yet implemented");
//	}
	
	Calculator calc=new Calculator();
	
	@Test
	void test_sum() {
		assertEquals(4,calc.sum(2, 2));
		
	}
	@Test
	void test_sum_fails() {
		assertEquals(25,calc.sum(5, 20));
	}
	

}
