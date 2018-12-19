package com.calata.codewars.kyu4;

import java.util.*;
import java.util.stream.Collectors;

public class Mixing {
    public static String mix(String s1, String s2) {

        String ret = "";

        String finalS1= Arrays.asList(s1.split("")).stream().filter(e-> e.matches("[a-z]")).sorted().collect(Collectors.joining(""));
        String finalS2 = Arrays.asList(s2.split("")).stream().filter(e-> e.matches("[a-z]")).sorted().collect(Collectors.joining(""));

        TreeMap<String, Integer> map1 = Arrays.asList(finalS1.split("")).stream()
                .filter(e-> finalS1.matches(".*["+e+"]{2,}.*"))
                .collect(Collectors.toMap(e-> e,
                        e1-> finalS1.replaceAll("[^"+e1+"]", "").length(),
                        (a, a1) ->  a,
                        TreeMap::new
                        ));
        TreeMap<String, Integer> map2 = Arrays.asList(finalS2.split("")).stream()
                .filter(e-> finalS2.matches(".*["+e+"]{2,}.*"))
                .collect(Collectors.toMap(e-> e,
                        e1-> finalS2.replaceAll("[^"+e1+"]", "").length(),
                        (a, a1) ->  a,
                        TreeMap::new
                ));

        Set<String> set = new HashSet<String>(map1.keySet());
        set.addAll(map2.keySet());

        ret = Arrays.asList(set.toArray()).stream()
                .sorted((Comparator<Object>) (o1, o2) -> {
                    int max1 = Math.max(map1.get(o1) != null ? map1.get(o1) : 0, map2.get(o1) != null ? map2.get(o1) : 0);
                    int max2 = Math.max(map1.get(o2) != null ? map1.get(o2) : 0, map2.get(o2) != null ? map2.get(o2) : 0);
                    if (max1 > max2) {
                        System.out.println(o1+","+o2+"->"+o1);
                        return -1;
                    } else if (max1 < max2) {
                        System.out.println(o1+","+o2+"->"+o2);
                        return 1;
                    } else {
                        System.out.println(o1+","+o2+"->"+(-((String)o1).compareTo((String)o2)));

                        return -((String)o1).compareTo((String)o2);
                    }
                })
                .map(e-> {
            Integer m1 = map1.get(e) != null ? map1.get(e) : 0;
            Integer m2 = map2.get(e) != null ? map2.get(e) : 0;
                    if (m1 > m2) {
                        return "1:".concat(String.join("",Collections.nCopies(m1, (CharSequence) e)));
                    } else if (m1 < m2){
                        return "2:".concat(String.join(  "",Collections.nCopies(m2, (CharSequence) e)));
                    }

                    return "=:".concat(String.join("", Collections.nCopies(m2, (CharSequence) e)));
        }).collect(Collectors.joining("/"));

        return ret;
    }
}
