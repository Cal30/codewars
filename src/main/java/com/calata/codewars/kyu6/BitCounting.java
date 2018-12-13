package com.calata.codewars.kyu6;


public class BitCounting {
    public static int countBits(int n){
        return Integer.toBinaryString(n).replaceAll("0","").length();
    }
}
