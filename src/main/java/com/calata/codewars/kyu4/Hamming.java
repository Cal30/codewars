package com.calata.codewars.kyu4;

import java.util.Arrays;
import java.util.TreeSet;

public class Hamming {

    public static long hamming(int n) {
        if (n <= 0) return -1;

        TreeSet<Long> set = new TreeSet<>(Arrays.asList(2L, 3L, 5L));
        long aux = 1;
        for (int i = 1; i < n; i++) {
            aux = set.pollFirst();

            set.add(aux*2);
            set.add(aux*3);
            set.add(aux*5);
        }

        return aux;
    }
}
