package com.calata.codewars.kyu7;

import java.util.Collections;
import java.util.List;
import java.util.stream.IntStream;

public class BinaryArrayToNumber {

    public static int ConvertBinaryArrayToInt(List<Integer> binary) {

        Collections.reverse(binary);
        return IntStream
                .range(0, binary.size())
                .map(e-> (int) (Math.pow(2, e)*binary.get(e))).sum();
    }
}
