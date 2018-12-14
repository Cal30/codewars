package com.calata.codewars.kyu5;

import java.util.stream.IntStream;

public class Max {
    public static int sequence(int[] arr) {

        int max = 0;
        for (int i=0;i<arr.length;i++){
            if(arr[i]> max){
                max = arr[i];
            }
            for (int j=i; j<arr.length;j++){
                if (j!=i){
                    int value = IntStream.rangeClosed(i,j).map(e-> arr[e]).sum();
                    if (value > max){
                        max = value;
                    }
                }
            }
        }

        return max;
    }

}
