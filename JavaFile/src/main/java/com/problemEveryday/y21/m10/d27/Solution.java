package com.problemEveryday.y21.m10.d27;

import java.util.*;

public class Solution {
    public static void main(String[] args) {
        int[] nums1 = {1,2,2,1};
        int[] nums2 = {2,2};
        System.out.println(Arrays.toString(intersection(nums1, nums2)));
    }

    public static int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set = new HashSet<>();
        Set<Integer> temp = new HashSet<>();
        for (int i : nums1) {
            set.add(i);
        }
        for (int i : nums2) {
            if (set.contains(i)) {
                temp.add(i);
            }
        }
        int[] res = new int[temp.size()];
        int index = 0;
        for (Integer i : temp) {
            res[index++] = i;
        }
        return res;
        //set1.stream().mapToInt(x -> x).toArray();
    }
}
