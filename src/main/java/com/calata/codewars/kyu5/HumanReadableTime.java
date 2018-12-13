package com.calata.codewars.kyu5;

public class HumanReadableTime {
    public static String makeReadable(int seconds) {
        // Do something
        int hours = seconds/3600;
        int minutes = (seconds%3600)/60;
        int secs = (seconds%3600)%60;

        return String.format("%02d", hours).concat(":")
                .concat(String.format("%02d", minutes)).concat(":")
                .concat(String.format("%02d", secs));

    }
}
