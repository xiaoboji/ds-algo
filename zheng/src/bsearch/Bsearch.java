package bsearch;

/**
 * @program: ds-algo
 * @description: 实现一个有序数组的二分查找算法
 * @author: xiaoboji
 * @create: 2020-10-14 23:50
 */
public class Bsearch {
  public static void main(String[] args) {
    int[] a = new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    System.out.println(bsearch(a, a.length, 8));
  }

  public static int bsearch(int[] a, int n, int value) {
    int low = 0;
    int high = n - 1;
    while (high >= low) {
      int mid = (low + high) / 2;
      if (value == a[mid]) {
        return mid;
      }
      if (value > a[mid]) {
        low = mid + 1;
      }
      if (value < a[mid]) {
        high = mid - 1;
      }
    }
    return -1;
  }
}
