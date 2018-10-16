package com.qa.BlackJack;

public class BlackJack {

	private final static int maxNum = 22;
	private final static int minNum = 2;

	public static int getMaxnum() {
		return maxNum;
	}

	public static int getMinnum() {
		return minNum;
	}
	

	public int play(int i, int j) {
		if (checkToPlay(i, j)) {
			int winner = 0;
			if (isBust(i)) {
				winner = j;
			} else if (isBust(j)) {
				winner = i;
			} else {
				winner = (i > j ? i : j);
			}
			return winner;
		} else {
			return 0;
		}
	
	}

	public boolean isBust(int i) {
		if (i >= maxNum) {
			return true;
		} else {
			return false;
		}
	}

	public boolean isImpossible(int i) {
		if (i < minNum) {
			return true;
		} else {
			return false;
		}
	}
	
	public boolean checkToPlay(int i, int j) {
		if (isImpossible(i) || isImpossible(j)) {
			return false;
		} else {
			return true;
		}
	}

}