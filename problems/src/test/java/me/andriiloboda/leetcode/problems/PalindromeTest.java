package me.andriiloboda.leetcode.problems;

import org.hamcrest.Matchers;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;

/**
 * Unit tests for {@link Palindrome}
 */
public class PalindromeTest {
	@Test
	public void test1() {
	    // Given...
		final Palindrome algo = new Palindrome();
		// When...
		assertThat(algo.isPalindrome(121), Matchers.is(true));
		assertThat(algo.isPalindrome(-121), Matchers.is(false));

		assertThat(algo.isPalindromeWithNoString(1221), Matchers.is(true));
		assertThat(algo.isPalindromeWithNoString(121), Matchers.is(true));
		assertThat(algo.isPalindromeWithNoString(-121), Matchers.is(false));
		assertThat(algo.isPalindromeWithNoString(12001), Matchers.is(false));
		assertThat(algo.isPalindromeWithNoString(10), Matchers.is(false));

	}
}
