package stack;

import java.util.Arrays;

/**
 * 基于数据实现顺序栈
 *
 * @author xiaoboji
 */
public class ArrayStack {
  private Integer size;
  private String[] stack;
  private Integer count;

  public ArrayStack(Integer size) {
    stack = new String[size];
    this.size = size;
    this.count = 0;
  }

  public static void main(String[] args) {
    ArrayStack arrayStack = new ArrayStack(5);
    arrayStack.push("1");
    arrayStack.push("2");
    arrayStack.push("3");
    arrayStack.push("4");
    arrayStack.push("5");
    arrayStack.push("6");
    System.out.println(arrayStack);
    arrayStack.pop();
    System.out.println(arrayStack);
    arrayStack.pop();
    arrayStack.pop();
    arrayStack.pop();
    arrayStack.pop();
    arrayStack.pop();
    System.out.println(arrayStack);
  }
  /**
   * 入栈
   *
   * @param msg 入栈内容
   * @returnresult
   */
  public boolean push(String msg) {
    if (count.equals(size)) {
      return false;
    }
    stack[count] = msg;
    count++;
    return true;
  }

  /**
   * 出栈
   *
   * @return result
   */
  public String pop() {
    if (0 == count.intValue()) {
      return null;
    }
    String tmp = stack[count - 1];
    stack[count - 1] = null;
    --count;
    return tmp;
  }

  public String toString() {
    return "ArrayStack{" + "stack=" + Arrays.toString(stack) + '}';
  }
}
