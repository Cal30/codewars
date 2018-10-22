package com.calata.codewars.kyu7;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SquareDigits {
	
	public int squareDigits(int n) {
		List<String> list = Arrays.asList(String.valueOf(n).split(""));
		
		String str = list.stream()
				.map(Integer::parseInt)
				.mapToDouble(e-> Math.pow(e, 2))
				.mapToInt(e1-> (int) e1)
				.mapToObj(e2-> String.valueOf(e2))
				.collect(Collectors.joining(""));
		
		return Integer.parseInt(str);
	}
}
