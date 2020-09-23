package recursion;

import java.util.Arrays;

/**
 * 编程实现数组的排序
 *
 * @author HP
 */
public class SortedCollection {

  public static void main(String[] args) {
    int n = 50;
    int[] collection = new int[n];
    for (int i = 0; i < n; i++) {
      collection[i] = (int) (100 * Math.random());
    }
    System.out.println(Arrays.toString(collection));
    System.out.println(Arrays.toString(solution(collection, 1)));
  }

  /**
   * 逐步从collection一个元素排序，到n个元素排序
   *
   * @param collection
   * @param count
   * @return
   */
  public static int[] solution(int[] collection, int count) {
    int length = collection.length;
    // 记录
    int index = 0;
    // 缓存第count个元素的值
    int temp = collection[count - 1];

    // 找到zhen第count个元素所处的位置index
    for (int i = 0; i < count - 1; i++) {
      if (collection[count - 1] < collection[i]) {
        index = i;
        break;
      }
      index = count - 1;
    }
    // index位置后面的元素依次往后移一位
    for (int i = count - 1; i > index; i--) {
      collection[i] = collection[i - 1];
    }
    // 把要排序的值放到该放的位置
    collection[index] = temp;
    // 终止条件
    if (count == length) {
      return collection;
    }
    // 逐步递归
    return solution(collection, count + 1);
  }
}
