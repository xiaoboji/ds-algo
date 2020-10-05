package recursion;

import java.util.HashMap;

/**
 * 编程实现求阶乘 n!
 *
 * @author HP
 */
public class Factorial {
  private static HashMap<Integer, Long> result = new HashMap<>();

  public static void main(String[] args) {
    result.put(1, 1L);
    result.put(2, 2L);
    System.out.println(solution(4));
  }

  public static Long solution(Integer n) {
    if (result.containsKey(n)) {
      return result.get(n);
    }

    Long l = solution(n - 1) * n;
    result.put(n, l);
    return l;
  }
}
