package me.andriiloboda.leetcode.problems;

import java.util.HashMap;
import java.util.Map;

/**
 * https://leetcode.com/problems/two-sum/
 */
class TwoSum {
	int[] twoSumBruteForce(final int[] nums, final int target) {
		final int arraySize = nums.length;
		for (int i = 0; i < arraySize - 1; i++) {
			for (int j = i + 1; j < arraySize; j++) {
				if (nums[i] + nums[j] == target) {
					return new int[]{i, j};
				}

			}
		}
		return null;
	}

	int[] twoSumHashTable(final int[] nums, final int target) {
		final Map<Integer, Integer> valueToIndex = new HashMap<>();
		for (int i = 0; i < nums.length; i++) {
			valueToIndex.put(nums[i], i);
		}

		for (int i = 0; i < nums.length; i++) {
			final int neededValue = target - nums[i];
			final Integer neededValueIndex = valueToIndex.get(neededValue);
			if (neededValueIndex!= null && neededValueIndex != i) {
				return new int[]{i, neededValueIndex};
			}
		}
		return null;
	}
}
