package com.calata.codewars.kyu5;

import java.util.Arrays;
import java.util.stream.Collectors;

public class PigLatin {
    public static String pigIt(String str) {
        return Arrays.asList(str.split(" ")).stream()
                .map(e-> {
                    if (e.matches("[a-zA-Z0-9]")){
                        return e.substring(1).concat(e.substring(0,1)).concat("ay");
                    }
                    return e;
                })
                .collect(Collectors.joining(" "));
    }
}
