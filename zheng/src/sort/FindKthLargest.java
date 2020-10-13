package sort;

/**
 * @program: ds-algo
 * @description: O(n)时间复杂度内求无序数组中第K大元素
 * @author: xiaoboji
 * @create: 2020-10-14 00:07
 */
public class FindKthLargest {
  public static void main(String[] args) {
    int[] array = {6, 2, 1, 3, 5, 4, 0, 9, 3, 1, 8, 7};
    solution(array, 0, array.length - 1, 1);
  }

  public static void solution(int[] s, int l, int r, int k) {

    if (l >= r) {
      if (l == r && l == k - 1) {
        System.out.println(s[l]);
      }
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
    if (i == k - 1) {
      System.out.println(s[i]);
    }
    // 递归调用
    if (i > k - 1) {
      solution(s, l, i - 1, k);
    }
    if (i < k - 1) {
      solution(s, i + 1, r, k);
    }
  }
}
