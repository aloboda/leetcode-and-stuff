package me.andriiloboda.leetcode.problems;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

/**
 * Unit tests for {@link ValidParenthesis}
 */
public class ValidParenthesisTest {
	private static final ValidParenthesis algorithm = new ValidParenthesis();

	@Test
	public void test1() {
		assertThat(algorithm.isValid("()[]{}"), is(true));
		assertThat(algorithm.isValid("(]"), is(false));
	}
}
