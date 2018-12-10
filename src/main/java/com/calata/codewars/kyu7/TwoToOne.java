package com.calata.codewars.kyu7;

import java.util.Arrays;
import java.util.stream.Collectors;

public class TwoToOne {
    public static String longest (String s1, String s2) {
        s1 = s1.concat(s2);
        s2 = "";
        while (!s1.isEmpty()){
            s2 = s2.concat(s1.substring(0,1));
            s1 = s1.replaceAll(s1.substring(0,1),"");
        }

        return Arrays.asList(s2.split("")).stream().sorted().collect(Collectors.joining(""));
    }
}
