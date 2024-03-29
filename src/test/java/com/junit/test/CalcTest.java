package com.junit.test;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalcTest {

	@Test
	public void test()
	{
		Calc c = new Calc();
		int actualRes = c.div(10, 5);
		int acceptedRes = 2;
		assertEquals(acceptedRes, actualRes);
	}

}
