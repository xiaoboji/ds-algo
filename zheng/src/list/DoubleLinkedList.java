package list;

import list.info.DoubleNode;

/**
 * The type Double linked list.
 *
 * @program: ds -algo
 * @description: 实现双向链表 ，支持增删操作
 * @author: xiaoboji
 * @create: 2020 -09-08 23:13
 */
public class DoubleLinkedList {
  /**
   * The entry point of application.
   *
   * @param args the input arguments
   */
  public static void main(String[] args) {
    DoubleNode head = new DoubleNode(1);
    DoubleNode node2 = new DoubleNode(2);
    DoubleNode node3 = new DoubleNode(3);
    DoubleNode node4 = new DoubleNode(4);
    DoubleNode node5 = new DoubleNode(5);

    head.next = node2;
    head.prior = null;
    node2.next = node3;
    node2.prior = head;
    node3.next = node4;
    node3.prior = node2;
    node4.next = node5;
    node4.prior = node3;
    node5.next = null;
    node5.prior = node4;
    System.out.println(printAll(head));

    DoubleNode node6 = new DoubleNode(6);
    add(2, head, node6);
    System.out.println(printAll(head));

    delete(3, head);
    System.out.println(printAll(head));
  }

  /**
   * Add.
   *
   * @param index the index
   * @param node the node
   * @param nodeNew the node new
   */
  public static void add(int index, DoubleNode node, DoubleNode nodeNew) {
    while (index != 0) {
      node = node.next;
      index--;
    }
    // 顺序不能错
    nodeNew.next = node.next;
    nodeNew.prior = node;

    node.next.prior = nodeNew;
    node.next = nodeNew;
  }

  /**
   * Delete.
   *
   * @param index the index
   * @param node the node
   */
  public static void delete(int index, DoubleNode node) {
    while (index != 0) {
      node = node.next;
      index--;
    }

    node.prior.next = node.next;
    node.next.prior = node.prior;
  }

  /**
   * Print all string.
   *
   * @param node the node
   * @return the string
   */
  public static String printAll(DoubleNode node) {
    StringBuilder result = new StringBuilder();
    while (node != null) {
      result.append("->value:");
      result.append(node.data);
      result.append("    next:");
      result.append(node.next);
      result.append("    prior:");
      result.append(node.prior);
      result.append("\n");

      node = node.next;
    }
    return result.toString();
  }
}
