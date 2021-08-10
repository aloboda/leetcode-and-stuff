package me.andriiloboda.leetcode.problems;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Stack;

public class ValidParenthesis {
	public boolean isValid(String s) {
		final int length = s.length();
		final Stack<Character> parenthesisStack = new Stack<>();
		final Map<Character, Character> openingToClosed = new HashMap<>();
		openingToClosed.put('(', ')');
		openingToClosed.put('[', ']');
		openingToClosed.put('{', '}');
		final Set<Character> openingChars = openingToClosed.keySet();
		for (int i = 0; i < length; i++) {
			final char currentChar = s.charAt(i);
			if (openingChars.contains(currentChar)) {
				parenthesisStack.push(currentChar);
			} else {
				if (parenthesisStack.isEmpty()) {
					return false;
				}
				final char expectedParenthesis = openingToClosed.get(parenthesisStack.pop());
				if (currentChar != expectedParenthesis) {
					return false;
				}
			}
		}
		return parenthesisStack.isEmpty();
	}
}
