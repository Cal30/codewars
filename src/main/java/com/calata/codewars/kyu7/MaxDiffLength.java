package com.calata.codewars.kyu7;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MaxDiffLength {
    public static int mxdiflg(String[] a1, String[] a2) {

        if (a1.length == 0 || a2.length == 0){
            return -1;
        }
        List<Integer> i1 = Arrays.asList(a1).stream().map(String::length).collect(Collectors.toList());
        List<Integer> i2 = Arrays.asList(a2).stream().map(String::length).collect(Collectors.toList());

        return Math.max(i1.stream().max(Integer::compareTo).get()-i2.stream().max(Integer::compareTo).get(),
                i2.stream().max(Integer::compareTo).get()-i1.stream().min(Integer::compareTo).get());
    }
}
