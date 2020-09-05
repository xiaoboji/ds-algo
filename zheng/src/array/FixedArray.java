package array;

import java.util.Arrays;

/**
 * The type Fixed array.
 *
 * @program: ds -algo
 * @description: 实现一个大小固定的有序数组 ，支持动态增删改操作
 * @author: xiaoboji
 * @create: 2020 -09-03 00:56
 */
public class FixedArray {
  private static int[] array;
  private int count;

  /**
   * Instantiates a new Fixed array.
   *
   * @param size the size
   */
  public FixedArray(int size) {
    array = new int[size];
  }

  /**
   * The entry point of application.
   *
   * @param args the input arguments
   */
  public static void main(String[] args) {
    FixedArray fixedArray = new FixedArray(10);
    // 新增
    fixedArray.add(3);
    fixedArray.add(2);
    fixedArray.add(1);
    fixedArray.add(5);
    fixedArray.add(4);
    fixedArray.add(5);
    fixedArray.add(4);
    fixedArray.add(5);
    fixedArray.add(4);
    fixedArray.add(5);
    fixedArray.add(4);
    System.out.println(Arrays.toString(array));
    // 删除
    fixedArray.delete(2);
    fixedArray.delete(2);
    System.out.println(Arrays.toString(array));
    // 修改
    fixedArray.update(2, -1);
    System.out.println(Arrays.toString(array));
  }

  /**
   * 新增数据
   *
   * @param value 值
   */
  private void add(int value) {
    if (count == array.length) {
      System.out.println("超了!");
      return;
    }

    if (count == 0 || value >= array[count - 1]) {
      array[count] = value;
      count++;
      return;
    }

    for (int i = 0; i < count; i++) {
      if (value <= array[i]) {
        front(i, count);
        array[i] = value;
        count++;
        break;
      }
    }
  }

  /**
   * 删除数据
   *
   * @param index 下标
   */
  private void delete(int index) {
    if (count == 0 || index >= count) {
      System.out.println("删不动了!");
      return;
    }

    back(index, count);
    array[count - 1] = 0;
    count--;
  }

  /**
   * 更新数据,先删后增
   *
   * @param index 下标
   * @param value 值
   */
  private void update(int index, int value) {
    delete(index);
    add(value);
  }

  /** 依次后移数组位置 */
  private void front(int start_idx, int count) {
    for (int i = 0; i < count - start_idx; i++) {
      array[count - i] = array[count - i - 1];
    }
  }

  /** 依次前移数组位置 */
  private void back(int start_idx, int count) {
    for (int i = 0; i < count - start_idx - 1; i++) {
      array[start_idx + i] = array[start_idx + i + 1];
    }
  }
}
