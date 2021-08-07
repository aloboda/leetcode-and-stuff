package me.andriiloboda.leetcode.problems;

import org.hamcrest.Matchers;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;

/**
 * Unit tests for {@link BestTimeToBuySellStock}
 */
public class BestTimeToBuySellStockTest {
	@Test
	public void test1() {
		// Given...
		final BestTimeToBuySellStock algo = new BestTimeToBuySellStock();
		// When...
		assertThat(algo.maxProfit(new int[]{7, 7, 1, 5, 3, 6, 4}), Matchers.is(5));
		assertThat(algo.maxProfit(new int[]{7, 6, 4, 3, 1}), Matchers.is(0));
	}
}
