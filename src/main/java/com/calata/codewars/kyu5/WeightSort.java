package com.calata.codewars.kyu5;



import org.springframework.util.StringUtils;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class WeightSort {

    public static String orderWeight(String strng) {

        if (StringUtils.isEmpty(strng)){
            return strng;
        }
        // Pair Comparator
        Comparator<Pair<String, Integer>> comp = (o1, o2) -> {
            if (o1.getValue().compareTo(o2.getValue()) == 0){
                return Comparator.comparing(String::toString).compare(o1.getKey(), o2.getKey());
            }

            return o1.getValue().compareTo(o2.getValue());
        };

        List<Pair<String, Integer>> list = Arrays.asList(strng.replaceAll(" +", " ").split(" +")).stream()
            .map(e-> {
                int sum = Arrays.asList(e.split("")).stream().mapToInt(Integer::parseInt).sum();
                return new Pair<>(e, Integer.valueOf(sum));
            }).collect(Collectors.toList());

        list.sort((o1,o2)-> comp.compare(o1,o2));

        return list.stream().map(e-> e.getKey()).collect(Collectors.joining(" "));
    }

    private static class Pair<K,V>{
        private K key;
        private V value;

        private Pair(K key, V value) {
            this.key = key;
            this.value = value;
        }

        public V getValue() {
            return value;
        }

        public void setValue(V value) {
            this.value = value;
        }

        public K getKey() {
            return key;
        }

        public void setKey(K key) {
            this.key = key;
        }
    }

}
