package array;

import java.util.Arrays;

/**
 * The type Merge sorted array.
 *
 * @program: ds -algo
 * @description: 实现两个有序数组合并为一个有序数组
 * @author: xiaoboji
 * @create: 2020 -09-05 00:44
 */
public class MergeSortedArray {
  /**
   * The entry point of application.
   *
   * @param args the input arguments
   */
  public static void main(String[] args) {
    int[] a = {11, 12, 13, 15, 16, 19};
    int[] b = {2, 4, 7, 8, 9};
    System.out.println(Arrays.toString(merge(a, b)));

    int[] a1 = {1, 2, 3};
    int[] b2 = {4, 7, 8, 9};
    System.out.println(Arrays.toString(merge(a1, b2)));
  }

  /**
   * Merge int [ ].
   *
   * @param a the a
   * @param b the b
   * @return the int [ ]
   */
  public static int[] merge(int[] a, int[] b) {
    int[] result = new int[a.length + b.length];
    // 特殊条件判断a的最小数值都大于b的最大数值
    if (a[0] >= b[b.length - 1]) {
      for (int i = 0; i < b.length; i++) {
        result[i] = b[i];
      }
      for (int i = 0; i < a.length; i++) {
        result[b.length + i] = a[i];
      }
      return result;
    }
    // 特殊条件判断b的最小数值都大于a的最大数值
    if (b[0] >= a[a.length - 1]) {
      for (int i = 0; i < a.length; i++) {
        result[i] = a[i];
      }
      for (int i = 0; i < b.length; i++) {
        result[a.length + i] = b[i];
      }
      return result;
    }

    // 循环拼接
    int idx_a = 0;
    int idx_b = 0;
    int idx_result = 0;
    while (!(idx_a == a.length || idx_b == b.length)) {
      if (a[idx_a] <= b[idx_b]) {
        result[idx_result] = a[idx_a];
        idx_a++;
      } else {
        result[idx_result] = b[idx_b];
        idx_b++;
      }
      idx_result++;
    }
    // 拼接剩余部分
    if (idx_a < a.length) {
      for (int i = idx_a; i < a.length; i++) {
        result[idx_result] = a[i];
        idx_result++;
      }
    }

    if (idx_b < b.length) {
      for (int i = idx_b; i < b.length; i++) {
        result[idx_result] = b[i];
        idx_result++;
      }
    }

    return result;
  }
}
