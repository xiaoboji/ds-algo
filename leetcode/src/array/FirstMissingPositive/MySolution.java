package array.FirstMissingPositive;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/** @author xiaoboji */
public class MySolution implements IFirstMissingPositive {

  @Override
  public int firstMissingPositive(int[] nums) {
    Set<Integer> set = new HashSet<>();
    return recursive(
            IntStream.of(nums).boxed().collect(Collectors.toList()).toArray(new Integer[0]), set)
        + 1;
  }

  /**
   * 递归实现
   *
   * @param nums 数组
   */
  public Integer recursive(Integer[] nums, Set<Integer> set) {
    set.clear();
    int length = nums.length;
    // 遍历数组，如果数据中存在小于0，或者大于nums.length的数，则剔除
    for (int i = 0; i < length; i++) {
      if (!(nums[i] <= 0 || nums[i] > length)) {
        set.add(nums[i]);
      }
    }

    if (!(set.size() == nums.length || set.size() == 0)) {
      recursive(set.toArray(new Integer[set.size()]), set);
    }
    return set.size();
  }
}
