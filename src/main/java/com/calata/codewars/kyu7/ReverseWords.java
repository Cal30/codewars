package com.calata.codewars.kyu7;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ReverseWords {

    public static String reverseWords(final String original)
    {
        if (original.trim().isEmpty()){
            return original;
        }

        List<String> list = Arrays.asList(original.split(" "));

        return list.stream()
                .map(e-> new StringBuilder(e).reverse().toString())
                .collect(Collectors.joining(" "));
    }
}
