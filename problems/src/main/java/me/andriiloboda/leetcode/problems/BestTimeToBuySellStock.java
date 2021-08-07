package me.andriiloboda.leetcode.problems;

/**
 * https://leetcode.com/problems/best-time-to-buy-and-sell-stock/
 */
public class BestTimeToBuySellStock {
	public int maxProfit(int[] prices) {
		int currentMaxProfit = 0;
		int currentMinPrice = prices[0];
		for (int day = 1; day < prices.length; day++) {
			final int profitCandidate = prices[day] - currentMinPrice;
			if (profitCandidate > currentMaxProfit) {
				currentMaxProfit = profitCandidate;
			}
			if (currentMinPrice > prices[day]) {
				currentMinPrice = prices[day];
			}

		}
		return currentMaxProfit;
	}
}
