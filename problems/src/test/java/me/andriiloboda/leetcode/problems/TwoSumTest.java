package me.andriiloboda.leetcode.problems;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

/**
 * Unit tests for {@link TwoSumTest}
 */
public class TwoSumTest {
	@Test
	public void test1() {
		// Then...
		final TwoSum algorithm = new TwoSum();
		assertThat(algorithm.twoSumBruteForce(new int[]{2, 7, 11, 15}, 9), is(new int[]{0, 1}));
		assertThat(algorithm.twoSumHashTable(new int[]{2, 7, 11, 15}, 9), is(new int[]{0, 1}));
	}
}
