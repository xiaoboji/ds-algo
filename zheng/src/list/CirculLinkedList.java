package list;

import list.info.CirculNode;

/**
 * The type Circul linked list.
 *
 * @program: ds -algo
 * @description: 实现循环链表 ，实现增删操作
 * @author: xiaoboji
 * @create: 2020 -09-08 00:23
 */
public class CirculLinkedList {
  /**
   * The entry point of application.
   *
   * @param args the input arguments
   */
  public static void main(String[] args) {
    CirculNode node5 = new CirculNode(5, null);
    CirculNode node4 = new CirculNode(4, node5);
    CirculNode node3 = new CirculNode(3, node4);
    CirculNode node2 = new CirculNode(2, node3);
    CirculNode head = new CirculNode(1, node2);
    node5.next = head;
    System.out.println(printAll(head));

    CirculNode nodeNew = new CirculNode(6, null);
    add(2, head, nodeNew);
    System.out.println(printAll(head));

    delete(3, head);
    System.out.println(printAll(head));
  }

  /**
   * 在指定节点后面添加新节点
   *
   * @param index the index，index >=0
   * @param node the node
   * @param nodeNew the node new
   */
  public static void add(int index, CirculNode node, CirculNode nodeNew) {
    while (index != 0) {
      node = node.next;
      index--;
    }
    nodeNew.next = node.next;
    node.next = nodeNew;
  }

  /**
   * Delete.
   *
   * @param index the index
   * @param node the node
   */
  public static void delete(int index, CirculNode node) {
    while (index != 0) {
      node = node.next;
      index--;
    }
    node.next = node.next.next;
  }

  /**
   * Print all string.
   *
   * @param node the node
   * @return the string
   */
  public static String printAll(CirculNode node) {
    String result = node.data + " " + node.next + "-->";
    CirculNode head = node;
    while (node.next != head) {
      node = node.next;
      result = result + node.data + " " + node.next + "-->";
    }
    return result;
  }
}
