package stack.info;

/**
 * @program: ds-algo
 * @description: ListNode
 * @author: xiaoboji
 * @create: 2020-09-19 22:24
 */
public class ListNode {

  public String value;

  public ListNode next;

  public ListNode(String value, ListNode next) {
    this.value = value;
    this.next = next;
  }

  public String getValue() {
    return value;
  }
}
