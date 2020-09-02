package array.ThreeSum;

/**
 * @program: leetcode
 * @description: three sum
 * @author: xiaoboji
 * @create: 2020-06-29 22:58
 */
public class Main {

  /**
   * 给你一个包含 n 个整数的数组 nums，判断 nums 中是否存在三个元素 a，b，c ，使得 a + b + c = 0 ？请你找出所有满足条件且不重复的三元组。
   * 注意：答案中不可以包含重复的三元组。
   */
  public static void main(String[] args) {
    int[] nums = new int[] {-1, 0, 1, 2, -1, -4};
    IThreeSum threeSum = new MySolution();
    System.out.println(threeSum.threeSum(nums));
  }
}
