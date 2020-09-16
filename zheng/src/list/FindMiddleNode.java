package list;

import list.info.ListNode;

/**
 * @program: ds-algo
 * @description: 实现求链表的中间结点
 * @author: xiaoboji
 * @create: 2020-09-15 00:49
 */
public class FindMiddleNode {
  public static void main(String[] args) {
    ListNode l11111 = new ListNode(5);

    ListNode l1111 = new ListNode(4, l11111);
    ListNode l111 = new ListNode(3, l1111);
    ListNode l11 = new ListNode(2, l111);
    ListNode l1 = new ListNode(1, l11);

    System.out.println(solution(l1));
  }

  public static int solution(ListNode listNode) {
    if (listNode.next == null || listNode == null) {
      return listNode.val;
    }
    ListNode first = listNode;
    ListNode second = listNode;

    while (second != null && second.next != null) {
      first = first.next;
      second = second.next.next;
    }

    return first.val;
  }
}
