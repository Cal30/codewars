package com.calata.codewars.kyu6;

public class TwoSum {

    public static int[] twoSum(int[] numbers, int target)
    {
        final int[] result = new int[2];
        for(int i=0; i<numbers.length; i++){
            for (int j=0; j<numbers.length; j++){

                if (i!=j && numbers[i]+numbers[j] == target){
                    result[0] = numbers[i];
                    result[1] = numbers[j];
                }
            }
        }

        return result;
    }
}
