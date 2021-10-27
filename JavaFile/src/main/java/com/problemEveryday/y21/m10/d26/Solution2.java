package com.problemEveryday.y21.m10.d26;

import java.lang.reflect.Array;
import java.util.*;

public class Solution2 {
    public static void main(String[] args) {
        String s = "anagram";
        String t = "nagaram";
        System.out.println(isAnagram(s, t));
    }

    public static boolean isAnagram(String s, String t) {
        //定义新数组储存各字母的出现次数
        ArrayList Sign = new ArrayList(Arrays.asList(s.split("")));
        //统计t中出现
        for (String c : t.split("")) {
            if (!Sign.remove(c)) {
                return false;
            }
        }
        //判断s和t是否为字母异位词
        return Sign.size() == 0;
    }
}