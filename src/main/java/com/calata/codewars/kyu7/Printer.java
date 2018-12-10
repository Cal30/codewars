package com.calata.codewars.kyu7;

public class Printer {
    public static String printerError(String s) {

        int error = 0;

        for (String e: s.split("")){
            if (!e.matches("[a-m]{1}")){
                error++;
            }
        }

        return error+"/"+s.length();
    }
}
