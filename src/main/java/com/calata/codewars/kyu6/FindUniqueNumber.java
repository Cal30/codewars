package com.calata.codewars.kyu6;

import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;

public class FindUniqueNumber {
    public static double findUniq(double arr[]) {
        final double[] ret = new double[1];
        Set<Double> arr2 = DoubleStream.of(arr).boxed().collect(Collectors.toSet());
        arr2.stream().forEach(e -> {
            if (DoubleStream.of(arr).filter(e1-> e == e1).count() == 1){
                ret[0] = e;

            }
        });
        // Do the magic
        return ret[0];
    }

}
