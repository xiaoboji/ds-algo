package sort;

import java.util.Arrays;

/**
 * 插入排序
 *
 * @author xiaoboji
 */
public class InsertionSort {

  public static void main(String[] args) {
    int[] array = {6, 2, 1, 3, 5, 4};
    System.out.println(Arrays.toString(solution(array)));
  }

  public static int[] solution(int[] array) {
    int n = array.length;
    if (n <= 1) {
      return array;
    }
    for (int i = 1; i < n; i++) {
      int value = array[i];
      int j = i - 1;
      // 寻找插入位置
      for (; j >= 0; j--) {
        if (array[j] > value) {
          // 移动数据
          array[j + 1] = array[j];
        } else {
          break;
        }
      }
      // 插入本次数据
      array[j + 1] = value;
    }
    return array;
  }
}
