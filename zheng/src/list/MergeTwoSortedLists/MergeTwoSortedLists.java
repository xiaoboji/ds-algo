package list.MergeTwoSortedLists;

/**
 * @program: ds-algo
 * @description: 将两个升序链表合并为一个新的 升序 链表并返回。新链表是通过拼接给定的两个链表的所有节点组成的。
 * @author: xiaoboji
 * @create: 2020-09-14 23:37
 */
public class MergeTwoSortedLists {
  public static void main(String[] args) {
    ListNode l111 = new ListNode(4);
    ListNode l11 = new ListNode(2, l111);
    ListNode l1 = new ListNode(1, l11);

    ListNode l222 = new ListNode(4);
    ListNode l22 = new ListNode(3, l222);
    ListNode l2 = new ListNode(1, l22);

    System.out.println(mergeTwoLists(l1, l2));
  }

  public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
    ListNode listNode = new ListNode();
    ListNode temp = listNode;

    while (l1 != null && l2 != null) {
      if (l1.val <= l2.val) {
        temp.next = l1;
        l1 = l1.next;
      } else {
        temp.next = l2;
        l2 = l2.next;
      }
      temp = temp.next;
    }
    temp.next = l1 == null ? l2 : l1;

    return listNode.next;
  }
}

class ListNode {
  int val;
  ListNode next;

  ListNode() {}

  ListNode(int val) {
    this.val = val;
  }

  ListNode(int val, ListNode next) {
    this.val = val;
    this.next = next;
  }

  @Override
  public String toString() {
    return "ListNode{" + "val=" + val + ", next=" + next + '}';
  }
}
