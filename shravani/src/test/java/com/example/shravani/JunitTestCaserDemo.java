package com.example.shravani;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.jupiter.api.Test;

import com.example.shravani.junit.NumericMethod;

class JunitTestCaserDemo {

	NumericMethod teach = new NumericMethod();

	@Before
	public void beforeM() {
		System.out.println("befor");
	}

	@After
	public void afterM() {
		System.out.println("after");
	}

	@Test
	public void sum_with1() {
		System.out.println("test1");
		assertEquals(12, teach.sum(new int[] { 2, 4, 6 }));
	}

	@Test
	public void sum_with2() {
		System.out.println("test2");
		assertEquals(22, teach.sum(new int[] { 4, 5, 6, 7 }));
	}

}
