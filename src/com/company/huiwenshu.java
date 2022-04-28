package com.company;

import java.util.Scanner;

/**
 * @author 终极庆庆
 * @version 1.0
 * @date 2022/4/6 16:51
 */
public class huiwenshu {

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.println("请输入要判断的回文数：");
        int i = sc.nextInt();
        System.out.println(isHuiwenshu(i));
    }


    public static boolean isHuiwenshu(int x){

        if (x<0){
            return false;
        }

            int temp= x;
        int n=0;
        while (x>0){
            n= n*10+x%10;

            x=x/10;
        }

        return temp==n;


    }
}
