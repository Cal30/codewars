package com.calata.codewars.kyu7;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Triangles {
    public static char triangle(final String row) {

        if (row.length() == 1){
            return row.charAt(0);
        }

        String[] rowList = row.split("");
        List<String> nextList = new ArrayList<>();

        for (int i=0; i<rowList.length-1;i++){
            nextList.add(resolvePair(rowList[i], rowList[i+1]));
        }

        String nextRow = nextList.stream().collect(Collectors.joining(""));

        return triangle(nextRow);
    }

    public static String resolvePair(String a, String b){
        if (a.equals(b)){
            return a;
        }

        return "RBG".replace(a,"").replace(b,"");
    }
}
