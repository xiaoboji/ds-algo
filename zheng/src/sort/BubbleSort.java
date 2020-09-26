package sort;

import java.util.Arrays;

/**
 * 冒泡排序
 *
 * @author xiaoboji
 */
public class BubbleSort {
  public static void main(String[] args) {
    int[] array = {6, 2, 1, 3, 5, 4};
    System.out.println(Arrays.toString(solution(array)));
  }

  public static int[] solution(int[] array) {
    if (array.length <= 1) {
      return array;
    }
    for (int i = 0; i < array.length; i++) {
      // 标志位，本轮没有交换，可以提前退出
      boolean flag = false;
      for (int j = 0; j < array.length - i - 1; j++) {
        if (array[j] > array[j + 1]) {
          swap(array, j, j + 1);
          // 本轮有交换
          flag = true;
        }
      }
      // 本轮无交换
      if (!flag) {
        break;
      }
    }
    return array;
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
