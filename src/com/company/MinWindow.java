package com.company;

import java.util.HashMap;

/**
 * @author 终极庆庆
 * 76. 最小覆盖子串
 * 给你一个字符串 s 、一个字符串 t 。返回 s 中涵盖 t 所有字符的最小子串。如果 s 中不存在涵盖 t 所有字符的子串，则返回空字符串 "" 。
 */
public class MinWindow {

    public static void main(String[] args) {

        String s= "ADOODEBANC";
        String t = "ABC";

        String s1 = minWindow(s, t);
        System.out.println(s1);

    }
    public static String minWindow(String s, String t) {

        char[] s1 = s.toCharArray();

        if (s.length() < t.length()) {
            return "";
        }
        HashMap<Character, Integer> need = new HashMap<>();
        HashMap<Character, Integer> window = new HashMap<>();


        for (char c : t.toCharArray()) {
            need.put(c, need.getOrDefault(c, 0) + 1);
        }

        int left = 0, right = 0;
        int vaild = 0;
        int start = 0, len = Integer.MAX_VALUE;
        while (right < s1.length) {

                char c = s1[right];
                right++;

                if (need.containsKey(c)) {
                    window.put(c, window.getOrDefault(c, 0) + 1);
                    if (window.get(c).equals(need.get(c))) {
                        vaild++;
                    }
                }

                while (vaild == need.size()) {
                    if (right - left < len) {
                        start = left;
                        len = right - left;
                    }

                    char d = s1[left];
                    left++;
                    if (need.containsKey(d)) {
                        if (window.get(d).equals(need.get(d))) {
                            vaild--;
                        }
                        window.put(d, window.get(d) - 1);
                    }
                }


        }
        return len==Integer.MAX_VALUE? "":s.substring(start, start+len);
    }
}
