package list.MergeSortedLists;

/**
 * @program: leetcode
 * @description: 合并k个排序链表
 * @author: xiaoboji
 * @create: 2020-07-14 23:22
 */
public class MergeSortedLists {
  public static void main(String[] args) {
    ListNode[] lists = new ListNode[3];
    ListNode list1 = new ListNode(1);
    ListNode list2 = new ListNode(4);
    ListNode list3 = new ListNode(5);
    ListNode list4 = new ListNode(1);
    ListNode list5 = new ListNode(3);
    ListNode list6 = new ListNode(4);
    ListNode list7 = new ListNode(2);
    ListNode list8 = new ListNode(6);
    list1.next = list2;
    list2.next = list3;
    list4.next = list5;
    list5.next = list6;
    list7.next = list8;
    lists[0] = list1;
    lists[1] = list2;
    lists[2] = list3;

    System.out.println(lists.length);
  }
}

class Solution {
  public ListNode mergeKLists(ListNode[] lists) {
    if (lists == null && lists.length == 0) {
      return null;
    }
    ListNode listnode = lists[0];
    listnode.next = null;
    for (int i = 0; i < lists.length - 1; i++) {
      while (lists[i].next != null) {}

      while (lists[i + 1].next != null) {
        if (listnode.val > lists[i + 1].val) {
          listnode = lists[i + 1];
        }
      }
    }
    return listnode;
  }
}

class ListNode {
  int val;
  ListNode next;

  ListNode(int x) {
    val = x;
  }

  @Override
  public String toString() {
    return val + " ";
  }
}
