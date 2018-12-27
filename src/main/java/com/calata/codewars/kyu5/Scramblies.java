package com.calata.codewars.kyu5;

import java.util.Arrays;

public class Scramblies {
	public static boolean scramble(String str1, String str2) {
		
		for(String e: Arrays.asList(str1.split(""))){
			
			str2 = str2.replaceFirst(e, "");
			
		}
		
		return str2.isEmpty();
	}
}
