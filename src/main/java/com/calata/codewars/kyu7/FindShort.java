package com.calata.codewars.kyu7;

import java.util.Arrays;
import java.util.Comparator;

public class FindShort {
	public static int findShort(String s) {
	
		String str = Arrays.asList(s.split(" "))
				.stream()
				.sorted(Comparator.comparing(String::length))
				.findFirst().get();
		
		return str.length();
	}
	
}
