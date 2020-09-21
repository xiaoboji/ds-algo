package queue;

import java.util.Arrays;

/**
 * 用数组实现一个顺序队列
 *
 * @author HP
 */
public class ArrayQueue {
  private String[] queue;
  private int size;
  private int head;
  private int tail;

  public ArrayQueue(int size) {
    queue = new String[size];
    this.size = size;
  }

  public static void main(String[] args) {
    ArrayQueue queue = new ArrayQueue(5);
    queue.enqueue("a");
    queue.enqueue("b");
    queue.enqueue("c");
    queue.enqueue("d");
    queue.enqueue("e");
    System.out.println(queue.toString());
    queue.dequeue();
    System.out.println(queue.toString());
    queue.dequeue();
    queue.dequeue();
    System.out.println(queue.toString());
    queue.enqueue("f");
    System.out.println(queue.toString());
  }

  /**
   * 入队列，
   *
   * @param item
   * @return
   */
  private boolean enqueue(String item) {
    if (tail == size) {
      // 数据迁移
      if (head < tail && head != 0) {
        for (int i = 0; i < tail - head; i++) {
          queue[i] = queue[head + i];
          queue[head + i] = null;
        }
        tail = tail - head;
        head = 0;
      } else {
        return false;
      }
    }
    queue[tail] = item;
    tail++;
    return true;
  }

  /**
   * 出队列
   *
   * @return item
   */
  private String dequeue() {
    if (head == tail) {
      return null;
    }
    String item = queue[head];
    queue[head] = null;
    head++;
    return item;
  }

  @Override
  public String toString() {
    return "ArrayQueue{" + "queue=" + Arrays.toString(queue) + '}';
  }
}
