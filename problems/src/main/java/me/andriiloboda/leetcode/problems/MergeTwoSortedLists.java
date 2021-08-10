package me.andriiloboda.leetcode.problems;

/**
 * https://leetcode.com/problems/merge-two-sorted-lists/submissions/
 */
public class MergeTwoSortedLists {
	public class ListNode {
		int val;
		ListNode next;

		ListNode() {
		}

		ListNode(int val) {
			this.val = val;
		}

		ListNode(int val, ListNode next) {
			this.val = val;
			this.next = next;
		}
	}

	public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
		ListNode currentL1 = l1;
		ListNode currentL2 = l2;
		ListNode initialResult = new ListNode();
		ListNode result = initialResult;
		while (currentL1 != null || currentL2 != null) {
			if (currentL1 != null && (currentL2 == null || currentL1.val <= currentL2.val)) {
				result.next = new ListNode(currentL1.val);
				currentL1 = currentL1.next;
			} else {
				result.next = new ListNode(currentL2.val);
				currentL2 = currentL2.next;
			}
			result = result.next;


		}
		return initialResult.next;
	}
}
