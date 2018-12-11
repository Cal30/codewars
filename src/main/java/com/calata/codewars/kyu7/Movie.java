package com.calata.codewars.kyu7;

public class Movie {
    public static int movie(int card, int ticket, double perc) {

        double discount = ticket*perc;
        double cardDouble = card;
        int i = 1;

        while (i*ticket < (int)Math.ceil(cardDouble+=discount)){
            discount = discount*perc;
            i++;
        }

        return i;
    }
}
