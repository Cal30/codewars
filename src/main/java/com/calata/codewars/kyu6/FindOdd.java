package com.calata.codewars.kyu6;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class FindOdd {
	
	public static int findIt(int[] a) {
		
		List<Integer> list = Arrays.stream(a).boxed().collect(Collectors.toList());
		
		return list.stream().filter(e-> Collections.frequency(list, e) % 2 != 0).findFirst().get();
		
	}
}
