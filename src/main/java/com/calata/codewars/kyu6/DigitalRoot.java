package com.calata.codewars.kyu6;

import java.util.Arrays;

public class DigitalRoot {
	public static int digital_root(int n) {
		
		if (n/10 == 0){
			return n;
		}
		
		n =  Arrays.asList(String.valueOf(n).split("")).stream().mapToInt(Integer::parseInt).sum();
		
		return digital_root(n);
	}
}
