package com.calata.codewars.kyu6;

public class Dubstep {
	
	public static String SongDecoder (String song) {
		return song.replaceAll("WUB", " ").replaceAll(" +", " ").trim();
	}
}

