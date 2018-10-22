package com.calata.codewars.kyu6;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertEquals;

@SpringBootTest
@RunWith(SpringRunner.class)
public class SpinWordsTest {
	
	@Test
	public void spinWords () {
		assertEquals("emocleW", new SpinWords().spinWords("Welcome"));
		assertEquals("Hey wollef sroirraw", new SpinWords().spinWords("Hey fellow warriors"));
	}
}