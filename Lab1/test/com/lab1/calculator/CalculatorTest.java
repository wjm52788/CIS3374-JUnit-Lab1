package com.lab1.calculator;

import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.Before;

public class CalculatorTest {
	private Calculator calculator;
	@Before
	public void setUp(){
		calculator = new Calculator();
	}
	@Test
	public void addTest() {
		assertEquals(4,calculator.add(2,2));
	}
	@Test
	public void subtractTest() {
		assertEquals(4, calculator.multiply(2, 2));
	}
	@Test
	public void multiplyTest() {
		assertEquals(4,calculator.multiply(2,2));
	}
	@Test
	public void divideTest() {
		assertEquals(1,calculator.divide(2,2));
	}
	@Test 
		public void isEqualPositiveTest() { 
	 		assertTrue(calculator.isEqual(2, 2)); 
	 	} 
	 	 
	@Test 
	 	public void isEqualNegativeTest() { 
	 		assertFalse(calculator.isEqual(4, 2)); 
	 	} 


}
