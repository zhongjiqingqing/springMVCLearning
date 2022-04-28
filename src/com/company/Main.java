package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i <n ; i++) {
            nums[i]=scanner.nextInt();
        }


        for (int i = 0; i < n; i++) {
            System.out.println(nums[i]);
        }
        System.out.println(nums.length);

        // write your code here
    }
}
