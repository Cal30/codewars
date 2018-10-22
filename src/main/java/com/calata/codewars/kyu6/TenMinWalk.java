package com.calata.codewars.kyu6;


public class TenMinWalk {
	
	public static boolean isValid(char[] walk) {
		
		final int[] x = {0};
		final int[] y = {0};
		
		System.out.println(walk);
		
		if (walk.length != 10){
			return false;
		}
		
		new String(walk).chars().mapToObj(e-> (char)e).forEach(e-> {
			switch (e){
				case 'e':
					x[0]++; break;
				case 'w':
					x[0]--; break;
				case 'n':
					y[0]++; break;
				case 's':
					y[0]--; break;
			}
		});
		
		return x[0] == 0 && y[0] == 0;
	}
	
}
