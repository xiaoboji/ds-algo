package list;

/**
 * @program: ds-algo
 * @description: 链表节点
 * @author: xiaoboji
 * @create: 2020-09-07 23:51
 */
public class Node {
  public int data;
  public Node next;

  public Node(int data, Node next) {
    this.data = data;
    this.next = next;
  }

  public int getData() {
    return data;
  }

  @Override
  public String toString() {
    return "Node{" + "data=" + data + ", next=" + next + '}';
  }
}
