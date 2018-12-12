package com.calata.codewars.kyu7;

import java.util.Arrays;
import java.util.stream.Collectors;

public class JadenCase {

    public String toJadenCase(String phrase) {
        if (phrase == null || phrase.isEmpty()){
            return null;
        }
        return Arrays.asList(phrase.split(" "))
                .stream()
                .map(e-> e.substring(0,1).toUpperCase().concat(e.substring(1)))
                .collect(Collectors.joining(" "));

    }
}
