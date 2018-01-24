package com.hc.hellojunit;

import static org.junit.Assert.*;

// import org.junit.Assert;

import org.junit.Test;

public class HelloTest {

	@Test
	public void testAdd() {
		Hello hello = new Hello();
		int ret = hello.add(10, 8);

		// 断言，  确定 方法的返回值 是 18 
		assertEquals(18, ret);
	}

}
