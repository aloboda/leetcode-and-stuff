package me.andriiloboda.leetcode.problems;

/**
 * https://leetcode.com/problems/add-two-numbers/submissions/
 */
public class AddTwoNumbers {
	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		ListNode finalResult = new ListNode();
		ListNode currentNode = finalResult;
		boolean incrementNode = false;
		while (l1 != null || l2 != null) {
			final int additionResult = safeSumNodes(l1, l2, incrementNode);
			incrementNode = false;
			if (additionResult >= 10) {
				incrementNode = true;
			}
			currentNode.next = new ListNode(additionResult % 10);
			currentNode = currentNode.next;
			l1 = l1 != null ? l1.next : null;
			l2 = l2 != null ? l2.next : null;
		}
		if (incrementNode) {
			currentNode.next = new ListNode(1);
		}
		return finalResult.next;
	}

	private int safeSumNodes(ListNode l1, ListNode l2, boolean incrementNode) {
		final int incrementValue = incrementNode ? 1 : 0;
		final int l1Value = l1 == null ? 0 : l1.val;
		final int l2Value = l2 == null ? 0 : l2.val;
		return l1Value + l2Value + incrementValue;
	}

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
}
