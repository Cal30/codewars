package com.calata.codewars.kyu7;

public class Middle {
    public static String getMiddle(String word) {

        return word.substring((word.length()%2 == 0 ? (word.length()/2)-1: (word.length()/2)), (word.length()/2)+1);

    }
}
