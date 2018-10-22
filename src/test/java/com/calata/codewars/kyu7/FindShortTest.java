package com.calata.codewars.kyu7;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertEquals;
@SpringBootTest
@RunWith(SpringRunner.class)
public class FindShortTest {
	
	@Test
	public void findShort() throws Exception {
		assertEquals(3, FindShort.findShort("bitcoin take over the world maybe who knows perhaps"));
		assertEquals(3, FindShort.findShort("turns out random test cases are easier than writing out basic ones"));
	}
}