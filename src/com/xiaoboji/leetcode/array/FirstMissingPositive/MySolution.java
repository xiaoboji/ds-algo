package com.xiaoboji.leetcode.array.FirstMissingPositive;

import java.util.ArrayList;
import java.util.List;

/** @author xiaoboji */
public class MySolution implements IFirstMissingPositive {

  @Override
  public int firstMissingPositive(int[] nums) {
    List list = new ArrayList();
    recursive(nums, list);
    return list.size() + 1;
  }

  /**
   * 递归实现
   *
   * @param nums 数组
   * @param list 链表
   */
  public void recursive(int[] nums, List list) {
    list.clear();
    int length = nums.length;
    for (int i = 0; i < length; i++) {
      if (!(nums[i] <= 0 || nums[i] > length)) {
        if (!list.contains(nums[i])) {
          list.add(nums[i]);
        }
      }
    }

    if (!(list.size() == nums.length || list.size() == 0)) {
      int[] array = new int[list.size()];
      // 使用for循环得到数组
      for (int i = 0; i < list.size(); i++) {
        array[i] = (int) list.get(i);
      }
      recursive(array, list);
    }
  }
}
