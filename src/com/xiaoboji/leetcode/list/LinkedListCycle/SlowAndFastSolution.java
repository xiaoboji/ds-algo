package com.xiaoboji.leetcode.list.LinkedListCycle;

/**
 * 快慢指针
 */
public class SlowAndFastSolution implements ILinkedListCycle{

    @Override
    public boolean hasCycle(ListNode head) {
        if (head == null || head.next == null) {
            return false;
        }

        ListNode slow = head;
        ListNode fast = head.next;

        while (fast != null && fast.next != null) {
            if (slow.equals(fast)) {
                return true;
            }
            slow = slow.next;
            fast = slow.next.next;
        }
        return false;

    }
}
