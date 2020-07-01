package com.xiaoboji.leetcode.list.LinkedListCycle;

import java.util.HashSet;
import java.util.Set;

/** Mysolution */
public class MySolution implements ILinkedListCycle {
  /**
   * 首先定义一个Set。 之后遍历链表的节点，每遍历一个节点，就将这个节点的元素放入set中，如果这个链表没有环，那么最终遍历就结束了。
   * 如果链表有环的话，那么肯定有一个元素会被访问两次，当第二次访问这个元素的时候，set中就有记录了，这样就可以判断出链表是否有环了。
   *
   */
  @Override
  public boolean hasCycle(ListNode head) {
    Set<Integer> set = new HashSet<>();
    while (head != null) {
      if (set.contains(head.hashCode())) {
        return true;
      }
      set.add(head.hashCode());
      head = head.next;
    }
    return false;
  }
}
