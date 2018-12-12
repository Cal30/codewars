package com.calata.codewars.kyu7;

import java.util.Arrays;

public class ShortestWord {

    public static int findShort(String s) {
        return Arrays.asList(s.split(" "))
                .stream()
                .mapToInt(e-> e.length()).min().getAsInt();
    }
}
