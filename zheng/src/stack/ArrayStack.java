package stack;

import java.util.Arrays;

/**
 * 基于数据实现顺序栈
 *
 * @author xiaoboji
 */
public class ArrayStack {
  /** 数组 */
  private Integer size;
  /** 栈中元素个数 */
  private String[] stack;
  /** 栈的大小 */
  private Integer count;

  /**
   * 初始化数组，申请一个大小为n的数组空间
   *
   * @param size the size
   */
  public ArrayStack(Integer size) {
    stack = new String[size];
    this.size = size;
    this.count = 0;
  }

  /**
   * The entry point of application.
   *
   * @param args the input arguments
   */
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
   * @return the boolean
   * @returnresult
   */
  public boolean push(String msg) {
    // 数组空间不够了，直接返回false，入栈失败。
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
   * @return result string
   */
  public String pop() {
    if (0 == count.intValue()) {
      return null;
    }
    // 一定要注意，是count-1
    String tmp = stack[count - 1];
    stack[count - 1] = null;
    --count;
    return tmp;
  }

  @Override
  public String toString() {
    return "ArrayStack{" + "stack=" + Arrays.toString(stack) + '}';
  }
}
