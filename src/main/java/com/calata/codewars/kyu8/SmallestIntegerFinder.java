package com.calata.codewars.kyu8;

import java.util.stream.IntStream;

public class SmallestIntegerFinder {

    public static int findSmallestInt(int[] args) {
        return IntStream.of(args).min().getAsInt();
    }
}
