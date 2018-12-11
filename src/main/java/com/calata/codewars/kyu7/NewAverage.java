package com.calata.codewars.kyu7;

import java.util.stream.DoubleStream;

public class NewAverage {

    public static long newAvg(double[] arr, double navg)
    {
        int i=1;
        double average = DoubleStream.of(arr).average().orElse(0d);

        if (average > navg){
            throw new IllegalArgumentException();
        }

        while (average+((i-average)/(arr.length+1)) < navg){
            i++;
        }

        return i;
    }
}
