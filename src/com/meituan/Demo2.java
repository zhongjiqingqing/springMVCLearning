package com.meituan;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author 终极庆庆
 * @version 1.0
 * @date 2022/4/28 17:16
 */
public class Demo2 {

        public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int[] arr = new int[n];
            for(int i=0;i<n;i++){
                arr[i] = sc.nextInt();
            }
            Arrays.sort(arr);

            int res = 0;
            for(int j=1;j<=n;j++){
                res =res+Math.abs(arr[j-1] - j);
            }
            System.out.println(res);
        }
    }

