package com.calata.codewars.kyu7;

import java.util.Arrays;
import java.util.List;

public class XO {
	
	public static boolean getXO (String str) {
		
		List<String> list = Arrays.asList(str.replaceAll("[^XOxo]", "").toLowerCase().split(""));
		
		return list.stream().filter(e-> e.equals("x")).count() == list.stream().filter(e-> e.equals("o")).count();
	
	}
}
