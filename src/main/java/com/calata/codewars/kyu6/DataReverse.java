package com.calata.codewars.kyu6;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class DataReverse {
    public static int[] DataReverse(int[] data) {

        String str = Arrays.stream(data)
                 .mapToObj(String::valueOf)
                 .collect(Collectors.joining(""));

        List<String> list = Arrays.asList(str.split("[01]{8}"));

        Collections.reverse(list);

        char[] array = list.stream().collect(Collectors.joining(""));




    }
}
