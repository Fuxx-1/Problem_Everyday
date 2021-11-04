package com.problemEveryday.y21.m11.d04;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Solution {
    public static void main(String[] args) {
        String a = "a";
        String b = "b";
        System.out.println(canConstruct(a, b));
    }

    public static boolean canConstruct(String ransomNote, String magazine) {
        int[] Flag = new int[26];
        int temp;
        for (int i = 0; i < magazine.length(); i++) {
            temp = magazine.charAt(i) - 'a';
            Flag[temp]++;
        }
        for (int i = 0; i < ransomNote.length(); i++) {
            temp = ransomNote.charAt(i) - 'a';
            if (Flag[temp] > 0) {
                Flag[temp]--;
            } else {
                return false;
            }
        }
        return true;
    }
}
