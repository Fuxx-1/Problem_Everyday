package com.problemEveryday.y21.m11.d02;

import java.util.*;

public class Solution {
    public static void main(String[] args) {
        int[] Sample = {2, 7, 11, 15};
        System.out.println(Arrays.toString(twoSum(Sample, 9)));
    }

    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> Temp = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int temp = target - nums[i];
            if (Temp.containsKey(temp)) {
                return new int[] {i, Temp.get(temp)};
            } else {
                Temp.put(nums[i], i);
            }
        }
        return null;
    }
}
