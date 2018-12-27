package com.calata.codewars.kyu4;

import java.util.ArrayList;
import java.util.List;

public class TenPinBowling {
	
	public static int bowling_score(String frames) {
		Integer score = 0, frame = 0;
		List<Integer> rolls = new ArrayList<>();
		String[] frameArray = frames.split(" ");
		
		for (String f : frameArray) {
			for (String b : f.split("")) {
				if (b.matches("X")) {
					rolls.add(10);
				}
				else if (b.matches("/")) {
					rolls.add(10 - rolls.get(rolls.size() - 1));
				}
				else {
					rolls.add(Integer.valueOf(b));
				}
			}
		}
		rolls.add(0);
		rolls.add(0);
		
		for (int i = 0; i < 10; i++) {
			Integer n = rolls.get(frame);
			Integer next = rolls.get(frame + 1);
			Integer following = rolls.get(frame + 2);
			if (n == 10) {
				score += n+next+following;
				frame++;
			} else if ((n+next) == 10) {
				score += n+next+following;
				frame += 2;
			} else {
				score += n+next;
				frame += 2;
			}
		}
		
		return score;
	}
}
