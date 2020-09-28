package sort;

import java.util.Arrays;

/**
 * 归并排序
 *
 * @author HP
 */
public class MergeSort {
  public static void main(String[] args) {
    int[] array = {6, 2, 1, 3, 5, 4, 8, 7};
    int start = 0;
    int end = array.length - 1;
    solution(array, start, end);
    System.out.println(Arrays.toString(array));
  }

  public static void solution(int[] array, int start, int end) {
    if (start >= end) {
      return;
    }
    int mid = (start + end) / 2;
    solution(array, start, mid);
    solution(array, mid + 1, end);
    merge(array, start, mid, end);
  }

  /**
   * 自己的解法
   *
   * @param array
   * @param start
   * @param mid
   * @param end
   */
  public static void merge(int[] array, int start, int mid, int end) {
    // 申请一个新的大小一样的空间
    int[] temp = new int[end - start + 1];
    int i = start;
    int j = mid + 1;
    int index = 0;
    // 排序两个子数组
    while (i <= mid && j <= end) {
      if (array[i] < array[j]) {
        temp[index] = array[i];
        i++;
      } else {
        temp[index] = array[j];
        j++;
      }
      index++;
    }
    // 拼接没有比较的后续数据
    if (i <= mid) {
      for (; i <= mid; ) {
        temp[index++] = array[i++];
      }
    }

    if (j <= end) {
      for (; j <= end; ) {
        temp[index++] = array[j++];
      }
    }
    // 将数据复制给原始数据
    for (int k = 0; k < temp.length; k++) {
      array[start + k] = temp[k];
    }
  }

  /**
   * 争的解法
   *
   * @param a
   * @param p
   * @param q
   * @param r
   */
  private static void mergeByzheng(int[] a, int p, int q, int r) {
    int i = p;
    int j = q + 1;
    // 初始化变量i, j, k
    int k = 0;
    // 申请一个大小跟a[p...r]一样的临时数组
    int[] tmp = new int[r - p + 1];
    // while条件一定要注意
    while (i <= q && j <= r) {
      if (a[i] <= a[j]) {
        // i++等于i:=i+1
        tmp[k++] = a[i++];
      } else {
        tmp[k++] = a[j++];
      }
    }

    // 判断哪个子数组中有剩余的数据
    int start = i;
    int end = q;
    if (j <= r) {
      start = j;
      end = r;
    }

    // 将剩余的数据拷贝到临时数组tmp
    while (start <= end) {
      tmp[k++] = a[start++];
    }

    // 将tmp中的数组拷贝回a[p...r]
    for (i = 0; i <= r - p; ++i) {
      a[p + i] = tmp[i];
    }
  }

  /**
   * 合并(哨兵)
   *
   * @param arr
   * @param p
   * @param q
   * @param r
   */
  private static void mergeBySentry(int[] arr, int p, int q, int r) {
    int[] leftArr = new int[q - p + 2];
    int[] rightArr = new int[r - q + 1];

    for (int i = 0; i <= q - p; i++) {
      leftArr[i] = arr[p + i];
    }
    // 第一个数组添加哨兵（最大值）
    leftArr[q - p + 1] = Integer.MAX_VALUE;

    for (int i = 0; i < r - q; i++) {
      rightArr[i] = arr[q + 1 + i];
    }
    // 第二个数组添加哨兵（最大值）
    rightArr[r - q] = Integer.MAX_VALUE;

    int i = 0;
    int j = 0;
    int k = p;
    while (k <= r) {
      // 当左边数组到达哨兵值时，i不再增加，直到右边数组读取完剩余值，同理右边数组也一样
      if (leftArr[i] <= rightArr[j]) {
        arr[k++] = leftArr[i++];
      } else {
        arr[k++] = rightArr[j++];
      }
    }
  }
}
