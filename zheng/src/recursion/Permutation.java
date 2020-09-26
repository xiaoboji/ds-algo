package recursion;

import java.util.Arrays;

/**
 * @program: ds-algo
 * @description: 编程实现一组数据集合的全排列
 *     <p>全排列：
 *     <p>从n个不同元素中任取m（m≤n）个元素，按照一定的顺序排列起来，叫做从n个不同元素中取出m个元素的一个排列。当m=n时所有的排列情况叫全排列。
 *     <p>例如
 *     <p>1 、2 、3三个元素的全排列为：
 *     <p>{1，2，3}，{1，3，2}，{2，1，3}，{2，3，1}，{3，1，2}，{3，2，1}。
 * @author: xiaoboji
 * @create: 2020-09-23 23:29
 */
public class Permutation {
  public static void main(String[] args) {
    int[] nums = {1, 2, 2};
    solution(nums, 0);
  }

  public static void swap(int[] nums, int i, int j) {
    int temp;
    temp = nums[i];
    nums[i] = nums[j];
    nums[j] = temp;
  }

  public static void solution(int[] nums, int start) {
    // 全排列结束，打印结果
    if (nums.length == start + 1) {
      System.out.println(Arrays.toString(nums));
      return;
    }
    for (int i = start; i < nums.length; i++) {
      // 新增判断是否交换
      if (isSwap(nums, i)) {
        // 将第i个元素交换至当前start下标处
        swap(nums, i, start);
        // 以递归的方式对剩下元素进行全排列
        solution(nums, start + 1);
        // 将第i个元素交换回原处
        swap(nums, i, start);
      }
    }
  }

  /**
   * 去重的全排列就是从第一个数字起每个数分别与它后面非重复出现的数字交换。
   *
   * @param nums
   * @param index
   * @return
   */
  public static boolean isSwap(int[] nums, int index) {
    // 是否交换
    for (int i = index + 1; i < nums.length; ++i) {
      if (nums[index] == nums[i]) {
        return false;
      }
    }
    return true;
  }
}
