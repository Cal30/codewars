package com.calata.codewars.kyu6;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class FindMissingLetter {

    public static char findMissingLetter(char[] array) {
        List<Integer> list = new ArrayList<>();
        for (char c: array){
            list.add((int)c);
        }

        int result = IntStream.rangeClosed(array[0], array[array.length-1])
                .filter(e-> list.stream().noneMatch(e1-> e1 == e))
                .findFirst().getAsInt();

        return (char)result;
    }
}
