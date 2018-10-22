package com.calata.codewars.kyu6;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Function;

import static java.util.stream.Collectors.joining;

public class Opstrings {
	public static String vertMirror (String strng) {
		List<String> split = Arrays.asList(strng.split("\n"));
		
		
		return split.stream().map(e-> horMirror(e, "")).collect(joining("\n"));
	}
	
	public static String horMirror(String strn, String separator){
		List<String> split = Arrays.asList(strn.split(separator));
		Collections.reverse(split);
		return split.stream().collect(joining(separator));
	}
	
	public static String horMirror (String strng) {
		return horMirror(strng ,"\n");
	}
	
	
	
	public static String oper (Function<String, String> operator, String s) {
		return operator.apply(s);
	}
}
