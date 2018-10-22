package com.calata.codewars.kyu6;

public class Multiplo_3_5 {
	
	public int solution(int number) {
		
		int sum = 0;
		
		for (int i=0; i<=number; i++){
			
			if (i%3 == 0 || i%5==0){
				sum += i;
			}
			
		}
		
		return sum;
	}
}
