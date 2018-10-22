package com.calata.codewars.kyu7;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertEquals;

@SpringBootTest
@RunWith(SpringRunner.class)
public class HighestLowestTest {
	@Test
	public void Test1() {
		assertEquals("42 -9", HighestLowest.HighAndLow("8 3 -5 42 -1 0 0 -9 4 7 4 -4"));
	}
}