package com.calata.codewars.kyu6;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class AreSame {
	
	public static boolean comp(int[] a, int[] b) {
		
		//os odio cuando poneis todas estas trabaas para condiciones
		
		if (a == null && b == null){
			return true;
		}
		if ((a == null && b!=null)|| (a!=null && b==null)){
			return false;
		}
		if (a!=null && b!=null && a.length != b.length){
			return false;
		}
		
		List<Integer> bList = IntStream.of(b).boxed().collect(Collectors.toList());
		
		for(int e: a){
			
			Integer i = bList.stream().filter(e1-> e1.intValue() == e*e).findFirst().orElse(null);
			if (i == null){
				break;
			}
			
			bList.remove(i);
		}
		
		return bList.isEmpty();
	}
}
