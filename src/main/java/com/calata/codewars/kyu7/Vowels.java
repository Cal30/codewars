package com.calata.codewars.kyu7;

import java.util.Arrays;

public class Vowels {
	
	public static int getCount(String str) {
		
		return (int) Arrays.asList(str.split("")).stream().filter(e-> e.matches("[aAeEiIoOuU]")).count();
	}
}
