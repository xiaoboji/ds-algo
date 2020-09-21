package queue;

/**
 * The type Linked list queue.
 *
 * @program: ds -algo
 * @description: 用链表实现一个队列
 * @author: xiaoboji
 * @create: 2020 -09-21 22:56
 */
public class LinkedListQueue {

  private static Node head;
  private static Node tail;

  /** Instantiates a new Linked list queue. */
  public LinkedListQueue() {
    head = new Node("0", null);
    tail = head;
  }

  /**
   * The entry point of application.
   *
   * @param args the input arguments
   */
  public static void main(String[] args) {
    LinkedListQueue linkedListQueue = new LinkedListQueue();
    linkedListQueue.enqueue("1");
    linkedListQueue.enqueue("2");
    linkedListQueue.enqueue("3");
    linkedListQueue.enqueue("4");
    System.out.println(printAll(head.next));
    linkedListQueue.dequeue();
    linkedListQueue.dequeue();
    System.out.println(printAll(head.next));
  }

  private static String printAll(Node node) {
    StringBuffer sb = new StringBuffer();
    Node temp = node;
    while (temp != null) {
      sb.append(temp.value);
      sb.append(" ");
      temp = temp.next;
    }
    return sb.toString();
  }

  /**
   * Enqueue boolean.
   *
   * @param value the value
   * @return the boolean
   */
  public boolean enqueue(String value) {
    tail.next = new Node(value, null);
    tail = tail.next;
    return true;
  }

  /**
   * Dequeue string.
   *
   * @return the string
   */
  public String dequeue() {
    if (head == null) {
      return null;
    }
    String item = head.getValue();
    head = head.next;
    // 边界条件
    if (head == null) {
      tail = null;
    }
    return item;
  }
}

/** The type Node. */
class Node {
  /** The Value. */
  public String value;

  /** The Next. */
  public Node next;

  /** Instantiates a new Node. */
  public Node() {}

  /**
   * Instantiates a new Node.
   *
   * @param value the value
   * @param node the node
   */
  public Node(String value, Node node) {
    this.value = value;
    this.next = node;
  }

  /**
   * Gets value.
   *
   * @return the value
   */
  public String getValue() {
    return value;
  }
}
