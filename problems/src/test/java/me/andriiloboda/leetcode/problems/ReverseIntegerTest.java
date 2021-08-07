package me.andriiloboda.leetcode.problems;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

/**
 * Unit tests for {@link ReverseInteger}
 */
public class ReverseIntegerTest {
	@Test
	public void test1() {
		final ReverseInteger algo = new ReverseInteger();
		// Then...
		assertThat(algo.reverse(123), is(321));
		assertThat(algo.reverse(-123), is(-321));
		assertThat(algo.reverse(0), is(0));
		assertThat(algo.reverse(1534236469), is(0));

	}
}
