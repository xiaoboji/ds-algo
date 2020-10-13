package sort;

import java.util.Arrays;

/**
 * 快速排序-填坑法
 *
 * @author xiaoboji
 */
public class QuickSort {

  public static void main(String[] args) {
    int[] array = {6, 2, 1, 3, 5, 4};
    solution(array, 0, array.length - 1);
    System.out.println(Arrays.toString(array));
  }

  public static void solution(int[] s, int l, int r) {
    System.out.println("start:" + Arrays.toString(s) + " start:" + l + " end:" + r);
    if (l >= r) {
      return;
    }

    // Swap(s[l], s[(l + r) / 2]); //将中间的这个数和第一个数交换 参见注1
    int i = l, j = r, x = s[l];
    while (i < j) {
      // 从右向左找第一个小于x的数
      while (i < j && s[j] >= x) {
        j--;
      }
      if (i < j) {
        s[i++] = s[j];
      }
      // 从左向右找第一个大于等于x的数
      while (i < j && s[i] < x) {
        i++;
      }
      if (i < j) {
        s[j--] = s[i];
      }
    }
    s[i] = x;
    // 递归调用
    solution(s, l, i - 1);
    solution(s, i + 1, r);
  }

  /**
   * 交换数据
   *
   * @param array
   * @param i
   * @param j
   */
  public static void swap(int[] array, int i, int j) {
    int temp = array[i];
    array[i] = array[j];
    array[j] = temp;
  }
}
