package com.problemEveryday.y21.m10.d26;

public class Solution {
    public static void main(String[] args) {
        String s = "anagram";
        String t = "nagaram";
        System.out.println(isAnagram(s, t));
    }

    public static boolean isAnagram(String s, String t) {
        //定义新数组储存各字母的出现次数
        int[] Sign = new int[26];
        //统计s中出现
        for (char a : s.toCharArray()) {
            Sign[a - 'a']++;
        }
        //统计t中出现
        for (char a : t.toCharArray()) {
            Sign[a - 'a']--;
        }
        //判断s和t是否为字母异位词
        for (int flag : Sign) {
            if (flag != 0) {
                return false;
            }
        }
        return true;
    }
}