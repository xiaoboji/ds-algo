package list;

import list.info.Node;

/**
 * The type Reverse single linked list. 反转一个单链表。 示例: 输入: 1->2->3->4->5->NULL 输出: 5->4->3->2->1->NULL
 *
 * @program: ds -algo
 * @description: 单链表反转
 * @author: xiaoboji
 * @create: 2020 -09-08 23:55
 */
public class ReverseSingleLinkedList {
  /**
   * The entry point of application.
   *
   * @param args the input arguments
   */
  public static void main(String[] args) {
    Node node5 = new Node(5, null);
    Node node4 = new Node(4, node5);
    Node node3 = new Node(3, node4);
    Node node2 = new Node(2, node3);
    Node head = new Node(1, node2);
    System.out.println(head);

    reverse(head);
  }

  /**
   * Reverse.
   *
   * @param head the head
   */
  public static void reverse(Node head) {
    if (head.next == null) {
      return;
    }
    int first = 0;
    int second = 0;

    Node temp = head;
    while (temp != null) {
      temp = temp.next;
      second++;
    }
    System.out.println();
    while (second - first <= 1) {}
  }
}
