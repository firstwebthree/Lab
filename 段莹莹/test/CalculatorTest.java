package com.dyy.test;

import static org.junit.Assert.*;


import org.junit.Before;
import org.junit.Test;
import org.junit.Ignore;

public class CalculatorTest {
	private static Calculator calculator = new Calculator();
	@Before
	public void setUp() throws Exception {
		calculator.clear();
	}

	@Test
	public void testAdd() {
		calculator.add(3);
        calculator.add(4);
        assertEquals(7, calculator.getResult());
	}

	@Test
	public void testSubstract() {
		calculator.add(8);
        calculator.substract(3);
        assertEquals(5, calculator.getResult());
	}

	@Ignore("Multiply() Not yet implemented") //将方法三忽略掉不进行测试
	@Test
	public void testMultiply() {
		fail("Not yet implemented");
	}

	@Test
	public void testDivide() {
		calculator.add(8);
        calculator.divide(0);
        assertEquals(4, calculator.getResult());
	}
	
	 @Test(timeout = 1000) //限时测试
	    public void squareRoot() {
	        calculator.squareRoot(4);
	        assertEquals(2, calculator.getResult());
	    }
	  @Test(expected = ArithmeticException.class)//测试异常
	  public void divideByZero(){
	        calculator.divide(0);
	   }


}
