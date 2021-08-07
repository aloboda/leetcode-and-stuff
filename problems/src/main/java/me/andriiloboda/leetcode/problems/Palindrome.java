package me.andriiloboda.leetcode.problems;

/**
 * https://leetcode.com/problems/palindrome-number/
 */
public class Palindrome {

	public boolean isPalindrome(int x) {
		if (x < 0) {
			return false;
		}
		final char[] chars = String.valueOf(x).toCharArray();
		final int size = chars.length;
		final int halfSize = size / 2;
		for (int i = 0; i < halfSize; i++) {
			if (chars[i] != chars[size - 1 - i]) {
				return false;
			}

		}
		return true;
	}

	public boolean isPalindromeWithNoString(int x) {
		if (x == 0){
			return true;
		}
		if (x < 0 || x % 10 == 0) {
			return false;
		}
		int revertedNumber = 0;
		while (x > revertedNumber) {
			final int numberFromRight = x % 10;
			revertedNumber = revertedNumber * 10 + numberFromRight;
			x = x / 10;
		}
		return revertedNumber == x || revertedNumber/10 == x;
	}
}
