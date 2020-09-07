package list;

/**
 * The type Single linked list.
 *
 * @program: ds -algo
 * @description: 实现单链表 ，支持增删操作
 * @author: xiaoboji
 * @create: 2020 -09-07 23:52
 */
public class SingleLinkedList {
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
    Node node1 = new Node(1, node2);
    System.out.println(node1);

    Node node6 = new Node(6, null);
    insert(node6, node3);
    System.out.println(node1);

    delete(node1, node6);
    System.out.println(node1);
  }

  /**
   * Insert node,在指定的节点后新增节点
   *
   * @param newOne the new one
   * @param oldOne the old one
   */
  public static void insert(Node newOne, Node oldOne) {
    newOne.next = oldOne.next;
    oldOne.next = newOne;
  }

  /**
   * Delete node，在链表A中删除某一个节点
   *
   * @param all the all
   * @param node the node
   */
  public static void delete(Node all, Node node) {
    while (all.next != null) {
      if (all.next.equals(node)) {
        all.next = node.next;
        return;
      }
      all = all.next;
    }
  }
}
