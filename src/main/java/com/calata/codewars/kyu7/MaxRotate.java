package com.calata.codewars.kyu7;

public class MaxRotate {

    public static long maxRot (long n) {
        String str = String.valueOf(n);
        int i = 0;
        while (i<str.length()){
            str = str.substring(0, i) + str.substring(i+1) + str.charAt(i);
            i++;
        }

        return Long.parseLong(str);
    }
}
