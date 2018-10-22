package com.calata.codewars.kyu7;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertEquals;

@SpringBootTest
@RunWith(SpringRunner.class)
public class SquareDigitsTest {
	
	@Test
	public void test() {
		assertEquals(811181, new SquareDigits().squareDigits(9119));
	}
}