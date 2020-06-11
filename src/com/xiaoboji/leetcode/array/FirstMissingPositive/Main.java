package com.xiaoboji.leetcode.array.FirstMissingPositive;

/**
 * title: 缺失的第一个正数
 * description:给你一个未排序的整数数组，请你找出其中没有出现的最小的正整数。
 * Example 1:
 *  Input: [1,2,0]
 *  Output: 3
 * Example 2:
 *  Input: [3,4,-1,1]
 *  Output: 2
 * Example 3:
 *  Input: [7,8,9,11,12]
 *  Output: 1
 * @author xiaoboji
 */
public class Main {

    public static int[] testcase = new int[]{-1,1};

    public static void main(String[] args) {
        IFirstMissingPositive firstMissingPositive =  new FirstGoodSolution();
        System.out.println(firstMissingPositive.firstMissingPositive(testcase));
    }

}
