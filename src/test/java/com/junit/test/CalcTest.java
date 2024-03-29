package com.junit.test;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalcTest {

	@Test
	public void test()
	{
		Calc c = new Calc();
		int actualRes = c.mul(10, 5);
		int acceptedRes = 50;
		assertEquals(acceptedRes, actualRes);
	}

}
