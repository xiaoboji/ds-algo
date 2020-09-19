package stack;

/**
 * 编程模拟实现一个浏览器的前进、后退功能
 *
 * @author HP
 */
public class SimpleBrowser {
  /** The Front. */
  static ArrayStack front = new ArrayStack(10);
  /** The Back. */
  static ArrayStack back = new ArrayStack(10);

  /**
   * 新打开一个网页
   *
   * @param page
   * @return
   */
  private static boolean open(String page) {
    front = new ArrayStack(10);
    return back.push(page);
  }

  /**
   * 后退一个网页
   *
   * @return
   */
  private static boolean front() {
    String page = front.pop();
    if (page == null) {
      return false;
    } else {
      return back.push(page);
    }
  }

  /**
   * 后退一个网页
   *
   * @return
   */
  private static boolean back() {
    String page = back.pop();
    if (page == null) {
      return false;
    } else {
      return front.push(page);
    }
  }

  /**
   * The entry point of application.
   *
   * @param args the input arguments
   */
  public static void main(String[] args) {
    open("page1");
    open("page2");
    open("page3");
    open("page4");

    System.out.println(front());
    System.out.println(back());
    System.out.println(front);
    System.out.println(back);
    System.out.println(back());
    System.out.println(front);
    System.out.println(back);
    open("page5");
    System.out.println(front);
    System.out.println(back);
    System.out.println(front());
    System.out.println(front);
    System.out.println(back);
  }
}
