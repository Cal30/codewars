package com.calata.codewars.kyu7;

import java.util.Arrays;
import java.util.Collections;
import java.util.stream.Collectors;

public class DescendingOrder {
    public static int sortDesc(final int num) {
        String strNum = Arrays.asList(String.valueOf(num).split(""))
                .stream()
                .map(e-> Integer.parseInt(e))
                .sorted(Collections.reverseOrder())
                .map(String::valueOf)
                .collect(Collectors.joining(""));

        return Integer.parseInt(strNum);
    }
}
