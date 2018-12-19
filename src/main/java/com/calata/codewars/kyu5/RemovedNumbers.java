package com.calata.codewars.kyu5;

import java.util.LinkedList;
import java.util.List;

public class RemovedNumbers {

    public static List<long[]> removNb2(long n) {

        LinkedList<long[]> pairs = new LinkedList<>();
        long sum = n * (n + 1) / 2;
        long lowerBound = ((n - 1) * n / 2) / (n + 1);
        long upperBound = (long) Math.sqrt(sum + 1) - 1;
        for (long a = upperBound; a >= lowerBound; a--) {
            long b = (sum - a)/(a + 1);
            if (a * b + a + b == sum) {
                pairs.addFirst(new long[]{a, b});
                pairs.addLast(new long[]{b, a});
            }
        }
        return pairs;
    }

    public static List<long[]> removNb(long n) {
        LinkedList<long[]> ret = new LinkedList<>();
        long sum = n*(n+1) / 2;
        /*List<Long> list = LongStream.rangeClosed(((n - 1) * n / 2) / (n + 1), (long) Math.sqrt(sum + 1) - 1)
                .boxed().collect(Collectors.toList()); timeout*/
        long min = ((n - 1) * n / 2) / (n + 1);
        long max = (long) Math.sqrt(sum + 1) - 1;
        for (long l1 = max; l1 >= min; l1--) {
            long l2 = (sum - l1)/(l1 + 1);

            if (sum == l1*l2 + l1 + l2){
                ret.add(new long[]{l1,l2});
                ret.add(new long[]{l2,l1});
            }

        }

        return ret;
    }
}
