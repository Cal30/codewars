package com.calata.codewars.kyu6;

import java.util.Arrays;
import java.util.List;

public class Persist {
	
	public static int persistence(long n) {
		int count = 0;
		
		while (n / 10 > 0){
			n = persistAux(n);
			count++;
		}
		
		return count;
	}
	
	private static long persistAux (long n) {
		
		List<String> list = Arrays.asList(String.valueOf(n).split(""));
		
		return list.stream().mapToInt(Integer::parseInt).reduce(1, (e, e1) -> e*e1);
	}
}
