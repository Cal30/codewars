package com.calata.codewars.kyu7;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Accumul {
	
	public static String accum(String s) {
		
		return IntStream.range(0, s.length())
				.mapToObj(e-> accumAux(String.valueOf(s.charAt(e)).toLowerCase(), e))
				.collect(Collectors.joining("-"));
	}
	
	private static String accumAux(String e, int index){
		
		String ret = new String(e);
		ret = ret.toUpperCase();
		
		for(int i=0; i< index; i++){
			ret+=e;
		}
		
		return ret;
	}
}
