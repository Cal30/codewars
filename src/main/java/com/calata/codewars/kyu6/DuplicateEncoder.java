package com.calata.codewars.kyu6;

import java.util.Arrays;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class DuplicateEncoder {
    static String encode(String word){

        return Arrays.asList(word.toLowerCase().split(""))
                .stream()
                .map(e->{
                    if (word.toLowerCase().replaceAll(Pattern.quote(e),"").length() < word.length()-1){
                        return ")";
                    }
                    return "(";
                })
                .collect(Collectors.joining(""));
    }
}
