package list.info;

/**
 * @program: ds-algo
 * @description: list node
 * @author: xiaoboji
 * @create: 2020-09-16 00:36
 */
public class ListNode {
  public int val;
  public ListNode next;

  public ListNode() {}

  public ListNode(int val) {
    this.val = val;
  }

  public ListNode(int val, ListNode next) {
    this.val = val;
    this.next = next;
  }

  @Override
  public String toString() {
    return "ListNode{" + "val=" + val + ", next=" + next + '}';
  }
}
