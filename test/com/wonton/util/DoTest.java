package com.wonton.util;

import static org.junit.Assert.*;

import org.junit.Test;

public class DoTest {
	@Test
	public void testAdd() {
		assertEquals(8, new Getest().add(3, 5));
	}

	@Test
	public void testSubtract() {
		assertEquals(2, new Getest().subtract(5, 3));
	}
}