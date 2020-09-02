package array.ThreeSum;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @program: leetcode
 * @description: 我的解法
 * @author: xiaoboji
 * @create: 2020-06-29 23:05
 */
public class MySolution implements IThreeSum {

  @Override
  public List<List<Integer>> threeSum(int[] nums) {

    List<Integer> list = new ArrayList<>();
    for (int i : nums) {
      list.add(i);
    }
    List<List<Integer>> result = new ArrayList<>();

    for (int first = 0; first < list.size(); first++) {
      for (int second = first + 1; second < list.size(); second++) {
        Integer threevalue = list.get(first) + list.get(second);
        for (int three = second + 1; three < list.size(); three++) {
          if ((-threevalue) == (list.get(three))) {
            List<Integer> temp = new ArrayList<>();
            temp.add(list.get(first));
            temp.add(list.get(second));
            temp.add(-threevalue);
            Collections.sort(temp);
            if (!result.contains(temp)) {
              result.add(temp);
            }
          }
        }
      }
    }
    return result;
  }
}
