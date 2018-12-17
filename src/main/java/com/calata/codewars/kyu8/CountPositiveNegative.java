package com.calata.codewars.kyu8;

import java.util.stream.IntStream;

public class CountPositiveNegative {
    public static int[] countPositivesSumNegatives(int[] input)
    {
        return new int[]{(int)IntStream.of(input).boxed().filter(e-> e > 0).mapToInt(Integer::new).count(),
                (int)IntStream.of(input).boxed().filter(e-> e < 0).mapToInt(Integer::new).count()
        };
    }
}
