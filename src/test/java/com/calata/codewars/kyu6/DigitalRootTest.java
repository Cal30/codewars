package com.calata.codewars.kyu6;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertEquals;

@SpringBootTest
@RunWith(SpringRunner.class)
public class DigitalRootTest {
	
	@Test
	public void Tests() {
		assertEquals( "Nope!" , 7, DigitalRoot.digital_root(16));
		assertEquals( "Nope!" , 6, DigitalRoot.digital_root(456));
	}
	
}