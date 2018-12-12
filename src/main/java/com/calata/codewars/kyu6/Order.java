package com.calata.codewars.kyu6;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Order {

    public static String order(String words) {

        List<String> list = Arrays.asList(words.split(" "));

        return IntStream.rangeClosed(1, list.size())
                .mapToObj(e-> list.stream()
                        .filter(e1-> e1.contains(String.valueOf(e)))
                        .findFirst()
                        .orElse(""))
                .collect(Collectors.joining(" "));
    }
}
