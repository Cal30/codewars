package com.calata.codewars.kyu7;

public class Snail {
    public static int snail(int column, int day, int night) {

        int ret = 1;
        int result = 0;

        while ((result+=day) < column){
            result-=night;
            ret++;
        }

        return ret;
    }
}
