package com.calata.codewars.kyu6;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class FindOutlier {

    static int find(int[] integers){

        List<Integer> even = IntStream.of(integers).filter(e-> e%2 == 0).boxed().collect(Collectors.toList());
        List<Integer> odd = IntStream.of(integers).filter(e-> e%2 != 0).boxed().collect(Collectors.toList());

        return even.size() > odd.size() ? odd.get(0) : even.get(0);

    }
}
