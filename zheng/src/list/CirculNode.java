package list;

/**
 * @program: ds-algo
 * @description: 循环链表节点
 * @author: xiaoboji
 * @create: 2020-09-08 00:29
 */
public class CirculNode {
  public int data;
  public CirculNode next;

  public CirculNode(int data, CirculNode next) {
    this.data = data;
    this.next = next;
  }

  public int getData() {
    return data;
  }
}
