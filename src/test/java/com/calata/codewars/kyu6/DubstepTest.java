package com.calata.codewars.kyu6;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertEquals;

@SpringBootTest
@RunWith(SpringRunner.class)
public class DubstepTest {
	
	@Test
	public void Test1() {
		assertEquals("ABC", new Dubstep().SongDecoder("WUBWUBABCWUB"));
	}
	@Test
	public void Test2()
	{
		assertEquals("R L", new Dubstep().SongDecoder("RWUBWUBWUBLWUB"));
	}
}