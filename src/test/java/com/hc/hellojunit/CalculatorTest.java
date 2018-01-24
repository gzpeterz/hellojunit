package com.hc.hellojunit;

import static org.junit.Assert.assertEquals;

import static org.junit.Assert.assertThat;
import static org.junit.Assert.fail;
import static org.hamcrest.Matchers.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

public class CalculatorTest {
	Calculator cal = new Calculator();

	@BeforeClass
	public static void beforeClass() throws Exception {
		System.out.println("in beforeClass");
	}

	@AfterClass
	public static void afterClass() throws Exception {
		System.out.println("in afterClass");
	}

	@Before
	public void before() throws Exception {
		cal.clear();
		System.out.println("in before");
	}

	@After
	public void after() throws Exception {
		System.out.println("in after");
	}

	@Test
	public void  testAdd() {
		cal.add(5);
		cal.add(6);
		int ret = cal.getResult();
		assertEquals("in testAdd", 11, ret);
		// int i = 10/0;
	}

	@Test
	public void testSubstract() {
		cal.add(10);
		cal.substract(8);
		int ret = cal.getResult();
		assertThat(ret, is(2));
	}

	@Ignore
	@Test
	public void testMultiply() {
		fail("Not yet implemented");
	}

	@Ignore
	@Test
	public void testDivide() {
		fail("Not yet implemented");
	}

	@Ignore
	@Test
	public void testSquare() {
		fail("Not yet implemented");
	}

	@Test
	@Ignore
	public void testSquareRoot() {
		fail("Not yet implemented");
	}

}
