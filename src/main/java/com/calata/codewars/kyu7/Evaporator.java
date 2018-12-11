package com.calata.codewars.kyu7;

public class Evaporator {
    public static int evaporator(double content, double evap_per_day, double threshold) {

        double full = content;
        int day=1;

        while ((content-= (content*(evap_per_day/100))) > (full * (threshold / 100))) {
            day++;
        }

        return day;

    }
}
