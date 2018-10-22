package com.calata.codewars.kyu6;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static java.util.stream.Collectors.joining;

public class SpinWords {
	
	public String spinWords(String sentence) {
		
		return Arrays.stream(sentence.split(" ")).map(SpinWords::horMirror).collect(joining(" "));
	}
	
	private static String horMirror(String strn){
		List<String> split = Arrays.asList(strn.split(""));
		if (split.size() >= 5){
			Collections.reverse(split);
		}
		return split.stream().collect(joining(""));
	}
}
