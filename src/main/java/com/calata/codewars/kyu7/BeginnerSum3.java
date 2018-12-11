package com.calata.codewars.kyu7;

import java.util.stream.IntStream;

public class BeginnerSum3 {

    public int GetSum(int a, int b)
    {

        return IntStream.rangeClosed((a>b ? b: a), (a>b ? a: b)).sum();
    }
}
