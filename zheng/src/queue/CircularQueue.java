package queue;

import java.util.Arrays;

/**
 * The type Circular queue.确定好队空和队满的判定条件。
 *
 * @program: ds -algo
 * @description: 循环队列
 * @author: xiaoboji
 * @create: 2020 -09-21 23:56
 */
public class CircularQueue {

  private String[] queue;

  private int size;

  private int head;

  private int tail;

  /**
   * Instantiates a new Circular queue.
   *
   * @param size the size
   */
  public CircularQueue(int size) {
    queue = new String[size];
    this.size = size;
  }

  /**
   * The entry point of application.
   *
   * @param args the input arguments
   */
  public static void main(String[] args) {
    CircularQueue queue = new CircularQueue(5);
    queue.enqueue("a");
    queue.enqueue("b");
    queue.enqueue("c");
    queue.enqueue("d");
    queue.enqueue("e");
    System.out.println(queue);
    queue.enqueue("f");
    queue.dequeue();
    queue.dequeue();
    System.out.println(queue);
    queue.enqueue("j");
    queue.enqueue(".x");
    queue.dequeue();
    queue.enqueue(".b");
    queue.enqueue("!");
    System.out.println(queue);
  }

  /**
   * Enqueu boolean.(tail+1)%n=head时队列满了
   *
   * @param item the item
   * @return the boolean
   */
  public boolean enqueue(String item) {
    if ((tail + 1) % size == head) {
      return false;
    }
    queue[tail] = item;
    tail = (++tail) % size;
    return true;
  }

  /**
   * Dequeue string.
   *
   * @return the string
   */
  public String dequeue() {
    if (head == tail) {
      return null;
    }
    String result = queue[head];
    queue[head] = null;
    head = (++head) % size;
    return result;
  }

  @Override
  public String toString() {
    return "CircularQueue{" + "queue=" + Arrays.toString(queue) + '}';
  }
}
