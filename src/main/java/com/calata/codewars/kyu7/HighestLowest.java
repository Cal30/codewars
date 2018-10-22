package com.calata.codewars.kyu7;

import java.util.Arrays;
import java.util.List;

public class HighestLowest {
	
	public static String HighAndLow(String numbers) {
		
		List<String> list = Arrays.asList(numbers.split(" "));
		
		return list.stream().mapToInt(Integer::parseInt).max().getAsInt() + " " + list.stream().mapToInt(Integer::parseInt).min().getAsInt();
	}
	
}
