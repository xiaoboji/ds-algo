package array.MajorityElement;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @program: leetcode
 * @description: MajorityElement
 * @author: xiaoboji
 * @create: 2020-07-01 15:55
 */
public class Main {
  /** 给定一个大小为 n 的数组，找到其中的多数元素。 多数元素是指在数组中出现次数大于 ⌊ n/2 ⌋ 的元素。 你可以假设数组是非空的，并且给定的数组总是存在多数元素。 */
  public static void main(String[] args) {
    int[] nums = new int[] {2, 2, 1, 1, 1, 2, 2};
    System.out.println(majorityElement(nums));
  }

  private static int majorityElement(int[] nums) {
    List list = new ArrayList();
    for (int i : nums) {
      list.add(nums[i]);
    }
    Collections.sort(list);
    return (Integer) list.get((nums.length) / 2);
  }

  private static int majorityElement1(int[] nums) {
    int cand_num = nums[0], count = 1;
    for (int i = 1; i < nums.length; ++i) {
      if (cand_num == nums[i]) {
        ++count;
      } else if (--count == 0) {
        cand_num = nums[i];
        count = 1;
      }
    }
    return cand_num;
  }
}
