package com.test.testng;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.calc.LibMath;

public class testcalc {
	@Test
	public void CalcTest() {
		LibMath lib = new LibMath();
		int op1 = 100;
		int op2 = 200;
		int actSum = lib.Sum(op1, op2);
		int expSum = 300;
		assertEquals(actSum, expSum);
		System.out.println("Calculation");

	}

	@BeforeMethod
	public void beforeMethod() {
		System.out.println("Before Method");
	}

	@AfterMethod
	public void afterMethod() {
		System.out.println("After method");
	}

}
