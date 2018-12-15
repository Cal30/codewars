package com.calata.codewars.kyu4;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class TimeFormatter {
    public static String formatDuration(int seconds) {

        List<String > ret = new ArrayList<>();
        Map<String, Integer> durations = new LinkedHashMap<>() ;
        durations.put("year", 0);
        durations.put("day", 0);
        durations.put("hour", 0);
        durations.put("minute",0);
        durations.put("second", 0);


        int i = 2;
        for (String s: durations.keySet()){
            int aux = (int) (seconds/ ((s.equals("year") ? 365*24 : 1)*(s.equals("day") ? 24 : 1)*Math.pow(60, i)));

            if (aux > 0){
                seconds = (int) (seconds % ((s.equals("year") ? 365*24 : 1)*(s.equals("day") ? 24 : 1)*Math.pow(60, i)));
                ret.add((aux > 1 ? aux+" "+s+"s" : aux+" "+s));
            }
            if (s.equals("hour") || s.equals("minute")) {
                i--;
            }

        }

        String res = ret.stream().collect(Collectors.joining(", "));
        if (res.contains(",")){
            return new StringBuilder(res).replace(res.lastIndexOf(","), res.lastIndexOf(",")+1, " and").toString();
        }

        return res.isEmpty() ? "now": res;

    }
}
