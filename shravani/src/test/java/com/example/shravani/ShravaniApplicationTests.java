package com.example.shravani;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.shravani.junit.NumericMethod;

@SpringBootTest(classes = ShravaniApplicationTests.class)
class ShravaniApplicationTests {

	NumericMethod teach = new NumericMethod();
//	@Test
//	void contextLoads() {
//	}


	@Before
	public void beforeM() {
		System.out.println("befor");
	}

	@After
	public void afterM() {
		System.out.println("after");
	}
	@BeforeClass
	public static void beforeClass() {
		System.out.println("before class");
	}
	@AfterClass
	public static void afterClass() {
		System.out.println("after class");
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
