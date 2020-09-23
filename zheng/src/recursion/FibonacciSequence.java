package recursion;

import java.util.HashMap;

/**
 * 编程实现斐波那契数列求值 f(n)=f(n-1)+f(n-2)
 *
 * @author HP
 */
public class FibonacciSequence {

  private static HashMap<Integer, Long> result = new HashMap<>();

  public static void main(String[] args) {
    result.put(0, 0L);
    result.put(1, 1L);
    System.out.println(solution(10));
  }

  public static Long solution(Integer n) {
    if (result.containsKey(n)) {
      return result.get(n);
    }
    Long l = solution(n - 1) + solution(n - 2);
    result.put(n, l);
    return l;
  }
}
