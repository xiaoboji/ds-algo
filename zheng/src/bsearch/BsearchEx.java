package bsearch;

/**
 * The type Bsearch ex.
 *
 * @program: ds -algo
 * @description: 二分查找的变形增强应用
 * @author: xiaoboji
 * @create: 2020 -10-16 22:14
 */
public class BsearchEx {
  /**
   * The entry point of application.
   *
   * @param args the input arguments
   */
  public static void main(String[] args) {
    int[] a = new int[] {1, 2, 2, 2, 3, 6, 7, 7, 7, 10, 11, 11, 12, 13};
    int n = a.length;
    // 变体一：查找第一个值等于给定值的元素
    System.out.println("查找第一个值等于给定值的元素: " + bsearch1(a, n, 1));
    // 变体二：查找最后一个值等于给定值的元素
    System.out.println("查找最后一个值等于给定值的元素: " + bsearch2(a, n, 13));
    // 变体三：查找第一个大于等于给定值的元素
    System.out.println("查找第一个大于等于给定值的元素: " + bsearch3(a, n, 2));
    // 变体四：查找最后一个小于等于给定值的元素
    System.out.println("查找最后一个小于等于给定值的元素: " + bsearch4(a, n, 2));
  }

  /**
   * 变体一：查找第一个值等于给定值的元素
   *
   * @return the int
   */
  public static int bsearch1(int[] a, int n, int value) {
    int low = 0;
    int high = n - 1;
    while (low <= high) {
      int mid = (low + high) / 2;
      if (a[mid] < value) {
        low = mid + 1;
      } else if (mid != 0 && (a[mid] > value || (a[mid] == value && a[mid - 1] == value))) {
        high = mid - 1;
      } else {
        return mid;
      }
    }
    return -1;
  }

  /**
   * 变体二：查找最后一个值等于给定值的元素
   *
   * @return the int
   */
  public static int bsearch2(int[] a, int n, int value) {
    int low = 0;
    int high = n - 1;
    while (low <= high) {
      int mid = (low + high) / 2;
      if (mid != n - 1 && (a[mid] < value || (a[mid] == value && a[mid + 1] == value))) {
        low = mid + 1;
      } else if (a[mid] > value) {
        high = mid - 1;
      } else {
        return mid;
      }
    }
    return -1;
  }

  /**
   * 变体三：查找第一个大于等于给定值的元素
   *
   * @return the int
   */
  public static int bsearch3(int[] a, int n, int value) {
    int low = 0;
    int high = n - 1;
    while (low <= high) {
      int mid = (low + high) / 2;
      if (a[mid] < value) {
        low = mid + 1;
      } else if (mid != 0 && (a[mid] > value || (a[mid] == value && a[mid - 1] >= value))) {
        high = mid - 1;
      } else {
        return mid;
      }
    }
    return -1;
  }

  /**
   * 变体四：查找最后一个小于等于给定值的元素
   *
   * @return the int
   */
  public static int bsearch4(int[] a, int n, int value) {
    int low = 0;
    int high = n - 1;
    while (low <= high) {
      int mid = (low + high) / 2;
      if (mid != n - 1 && (a[mid] < value || (a[mid] == value && a[mid + 1] <= value))) {
        low = mid + 1;
      } else if (a[mid] > value) {
        high = mid - 1;
      } else {
        return mid;
      }
    }
    return -1;
  }
}
