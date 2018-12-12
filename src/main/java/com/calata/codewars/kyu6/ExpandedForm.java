package com.calata.codewars.kyu6;

public class ExpandedForm {

    // refactor please
    public static String expandedForm(int num)
    {
        String ret = "";
        int i = 1;

        for (String s: new StringBuilder(String.valueOf(num)).reverse().toString().split("") ){
            if (!s.equals("0")){
                ret = Integer.parseInt(s)*i + (ret.equals("") ? "" : " + ") + ret;
            }
            i=i*10;
        }

        return ret;

    }
}
