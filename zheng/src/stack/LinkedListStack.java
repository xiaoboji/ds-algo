package stack;

import stack.info.ListNode;

/**
 * 基于链表实现的链式栈
 *
 * @author HP
 */
public class LinkedListStack {
  private ListNode result = null;

  /**
   * The entry point of application.
   *
   * @param args the input arguments
   */
  public static void main(String[] args) {
    LinkedListStack linkedListStack = new LinkedListStack();
    linkedListStack.push("1");
    linkedListStack.push("2");
    linkedListStack.push("3");
    linkedListStack.push("4");
    linkedListStack.push("5");
    System.out.println(linkedListStack.printAll());
    linkedListStack.pop();
    linkedListStack.pop();
    System.out.println(linkedListStack.printAll());
  }

  /**
   * 入栈.
   *
   * @param msg the msg
   * @return the boolean
   */
  public boolean push(String msg) {
    ListNode newNode = new ListNode(msg, null);

    if (result == null) {
      result = newNode;
    } else {
      newNode.next = result;
      result = newNode;
    }
    return true;
  }

  /**
   * 出栈.
   *
   * @return the string
   */
  public String pop() {
    if (result == null) {
      return null;
    }
    String msg = result.getValue();
    result = result.next;
    return msg;
  }

  /**
   * 打印所有元素
   *
   * @return string
   */
  public String printAll() {
    StringBuilder sb = new StringBuilder();
    ListNode temp = result;
    while (temp != null) {
      sb.append(temp.getValue());
      sb.append(" ");
      temp = temp.next;
    }
    return sb.toString();
  }
}
