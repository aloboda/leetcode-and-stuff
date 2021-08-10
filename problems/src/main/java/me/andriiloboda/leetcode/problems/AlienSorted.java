package me.andriiloboda.leetcode.problems;

import java.util.HashMap;
import java.util.Map;

public class AlienSorted {
	boolean isAlienSorted(final String[] words, final String order) {
		final Map<Character, Integer> charToIndex = new HashMap<>();
		for (int i = 0; i < order.length(); i++) {
			charToIndex.put(order.charAt(i), i);

		}
		String currentWord = words[0];
		for (int i = 1; i < words.length; i++) {
			if (!areWordsInOrder(currentWord, words[i], charToIndex)) {
				return false;
			}
			currentWord = words[i];
		}
		return true;
	}

	private boolean areWordsInOrder(final String word1, final String word2, final Map<Character, Integer> charToOrderIndex) {
		final int word2Length = word2.length();
		for (int i = 0; i < word1.length(); i++) {
			if (i == word2Length) {
				return false;
			}
			final Integer word1CharOrder = charToOrderIndex.get(word1.charAt(i));
			final Integer word2CharOrder = charToOrderIndex.get(word2.charAt(i));
			if (word1CharOrder < word2CharOrder) {
				return true;
			} else if (word1CharOrder > word2CharOrder) {
				return false;
			}

		}
		return true;
	}
}
