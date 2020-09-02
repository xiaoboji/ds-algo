package array;

import java.util.Arrays;

/**
 * @program: ds-algo
 * @description: 实现一个动态扩容的数组
 * @author: xiaoboji
 * @create: 2020-09-03 00:22
 */
public class DynamicArray {
  private static int[] array;
  private int size;
  private int count;

  public DynamicArray(int size) {
    array = new int[size];
    this.size = size;
  }

  public static void main(String[] args) {
    // 初始为2
    DynamicArray dynamicArray = new DynamicArray(2);
    dynamicArray.add(1);
    dynamicArray.add(2);
    dynamicArray.add(3);
    dynamicArray.add(4);
    dynamicArray.add(5);
    System.out.println(Arrays.toString(array));
  };

  public void add(int value) {
    if (count == size) {
      // 扩容2倍
      int[] dynamicArray = new int[size * 2];
      size = size * 2;
      // 拷贝数据进新数组
      for (int i = 0; i < array.length; i++) {
        dynamicArray[i] = array[i];
      }
      // 使用array取代新数组
      array = dynamicArray;
    }
    // array赋值数据且下标+1
    array[count] = value;
    count++;
  }
}
