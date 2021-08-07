package me.andriiloboda.leetcode.problems;

/**
 * https://leetcode.com/problems/reverse-integer/
 */
class ReverseInteger {
	int reverse(int x) {
		final char[] numberAsChars = String.valueOf(x).toCharArray();
		final boolean isNegative = (numberAsChars[0] == '-');
		final int numberLength = numberAsChars.length;
		final char[] reverseNumberChars = new char[isNegative ? numberLength - 1 : numberLength];
		for (int i = isNegative ? 1 : 0; i < numberLength; i++) {
			reverseNumberChars[numberLength - i - 1] = numberAsChars[i];
		}
		try {
			final int result = Integer.parseInt(String.valueOf(reverseNumberChars));
			return isNegative ? result * -1 : result;
		} catch (NumberFormatException e) {
			return 0;
		}
	}
}
