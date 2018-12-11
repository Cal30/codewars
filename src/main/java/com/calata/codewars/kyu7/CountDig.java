package com.calata.codewars.kyu7;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class CountDig {
    public static int nbDig(int n, int d) {

       return IntStream.rangeClosed(0,n)
               .map(e-> e*e)
               .mapToObj(String::valueOf)
               .collect(Collectors.joining(""))
               .replaceAll("[^"+d+"]","")
               .length();
    }
}
