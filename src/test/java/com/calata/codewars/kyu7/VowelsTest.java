package com.calata.codewars.kyu7;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class VowelsTest {
	
	@Test
	public void getCount () {
		assertEquals("Nope!", 5, Vowels.getCount("abracadabra"));
		
	}
}