package com.meituan;


import java.util.Arrays;
import java.util.Scanner;

/**
 * @author 终极庆庆
 * @version 1.0
 * @date 2022/4/28 14:48
 * 某比赛已经进入了淘汰赛阶段,已知共有n名选手参与了此阶段比赛，
 * 他们的得分分别是a_1,a_2….a_n,小美作为比赛的裁判希望设定一个分数线m，
 * 使得所有分数大于m的选手晋级，其他人淘汰。
 * 但是为了保护粉丝脆弱的心脏，小美希望晋级和淘汰的人数均在[x,y]之间。
 * 显然这个m有可能是不存在的，也有可能存在多个m，如果不存在，请你输出-1，如果存在多个，
 * 请你输出符合条件的最低的分数线
 */
public class Demo1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //n为参赛人数， x y 晋级淘汰人数区间。
        int n = sc.nextInt();
        int x = sc.nextInt();
        int y = sc.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        Arrays.sort(nums);

        if(n<2*x||n>2*y){
            System.out.println(-1);
            return;
        }

        int left= x;
        int right =y+1;
        while(left<right){
            int mid = left+(right-left)/2;

            if(n-mid>=x || n-mid<=y){
                right =mid;

            }else {
                left = mid+1;
            }
        }
        System.out.println(nums[left-1]);
    }
}
