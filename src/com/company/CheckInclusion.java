package com.company;

import java.util.HashMap;

/**
 * @author 终极庆庆
 * @version 1.0
 * @date 2022/4/22 15:31
 */
public class CheckInclusion {

    public static void main(String[] args) {



    }

    public static  boolean checkInclusion(String s1, String s2) {

        HashMap<Character, Integer> need = new HashMap<>();
        HashMap<Character, Integer> window = new HashMap<>();
        for (char c:s2.toCharArray()
             ) {
            need.put(c, need.getOrDefault(c, 0)+1);
        }

        int left = 0;
        int right = 0;
        int vaild =0;

        while(right<s1.length()){

            char c = s1.charAt(right);
            right++;

            if(need.containsKey(c)){
                window.put(c, window.getOrDefault(c, 0)+1);
                if(window.get(c).equals(need.get(c))){
                    vaild++;
                }
            }

            //判断收缩
            while(right-left>s2.length()){
                if(vaild==need.size()){
                    return true;
                }

                char d = s1.charAt(left);
                left++;

                if(need.containsKey(d)){
                    if(window.get(d).equals(need.get(d))){
                        vaild--;
                    }

                window.put(d, window.get(d)-1);
                }

            }


        }
        return false;
    }

}

