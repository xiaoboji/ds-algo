package sort;

import java.util.Arrays;

/**
 * 快速排序
 *
 * @author xiaoboji
 */
public class Quicksort {
  public static void main(String[] args) {
    int[] array = {6, 2, 1, 3, 5, 4};
    solution(array, 0, array.length - 1);
    System.out.println(Arrays.toString(array));
  }

  public static void solution(int[] array, int start, int end) {
    System.out.println("start:" + Arrays.toString(array) + " start:" + start + " end:" + end);
    if (start >= end) {
      return;
    }

    int temp = array[end];
    int i = start;
    int j = end;
    while (i < j) {
      while (array[i] < temp && i < j) {
        i++;
      }
      while (array[j] >= temp && i < j) {
        j--;
      }
      if (i < j) {
        swap(array, i, j);
        i++;
        j--;
      }
    }
    array[end] = array[i + 1];
    array[i + 1] = temp;
    System.out.println("end:" + Arrays.toString(array));

    solution(array, start, i - 1);
    solution(array, i + 1, end);
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
