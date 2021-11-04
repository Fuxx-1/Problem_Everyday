package com.problemEveryday.y21.m11.d03;

import java.sql.ResultSet;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Solution {
    public static void main(String[] args) {
        int[] a = {1, 2};
        int[] b = {-1, -2};
        int[] c = {-1, 2};
        int[] d = {0, 2};
        System.out.println(fourSumCount(a, b, c, d));
    }

    public static int fourSumCount(int[] nums1, int[] nums2, int[] nums3, int[] nums4) {
        int Result = 0;
        Map<Integer, Integer> temp = new HashMap<>();
        for (int i : nums1) {
            for (int j : nums2) {
                if (temp.containsKey(i + j)) {
                    temp.put(i + j, temp.get(i + j) + 1);
                } else {
                    temp.put(i + j, 1);
                }
            }
        }
        for (int i : nums3) {
            for (int j : nums4) {
                if (temp.containsKey(-i - j)) {
                    Result += temp.get(-i - j);
                }
            }
        }
        return Result;
    }
}
