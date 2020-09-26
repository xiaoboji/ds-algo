package sort;

import java.util.Arrays;

/**
 * 选择排序
 *
 * @author xiaoboji
 */
public class SelectionSort {
  public static void main(String[] args) {
    int[] array = {6, 2, 1, 3, 5, 4};
    System.out.println(Arrays.toString(solution(array)));
  }

  public static int[] solution(int[] array) {
    int n = array.length;
    if (n <= 1) {
      return array;
    }

    for (int i = 0; i < n; i++) {
      int temp = array[i];
      // 记录最小值的下标
      int index = i;
      for (int j = i + 1; j < n; j++) {
        // 更新最小值和下标
        if (array[j] < temp) {
          temp = array[j];
          index = j;
        }
      }
      // 如果未排序中有更小的，则交换位置
      if (i != index) {
        swap(array, i, index);
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
