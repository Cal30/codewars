package com.calata.codewars.kyu6;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.stream.Collectors;

public class StockList {
	// 1st parameter is the stocklist (L in example),
	// 2nd parameter is list of categories (M in example)
	public static String stockSummary(String[] lstOfArt, String[] lstOf1stLetter) {
		
		if ( lstOfArt.length == 0 || lstOf1stLetter.length == 0){
			return "";
		}
		
		LinkedHashMap<String, Integer> map = Arrays.asList(lstOf1stLetter).stream().collect(Collectors.toMap(p-> p, p-> 0, (e, e1) -> e,LinkedHashMap::new));
		for(String e: lstOf1stLetter){
			for (String s: lstOfArt){
				Integer count = 0;
				if (s.startsWith(e)){
					count = Integer.valueOf(s.substring(s.indexOf(" ")+1, s.length()));
				}
				
				map.put(e, map.get(e)+count);
			}
		}
		
		return map.keySet().stream()
				.map(e-> "("+e+" : "+map.get(e)+")")
				.collect(Collectors.joining(" - "));
	
	}
}
