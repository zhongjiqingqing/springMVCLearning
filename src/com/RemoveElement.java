package com;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author 终极庆庆
 * @version 1.0
 * @date 2022/4/3 15:37
 */
public class RemoveElement {




//
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.println("请输入数组个数");
        int n = sc.nextInt();
        int[] nums= new int[n];

        for (int i = 0; i <n; i++) {
            nums[i]=sc.nextInt();
        }

        System.out.println("数组为"+ Arrays.toString(nums));


        System.out.println("属于要移除的元素");
            int val= sc.nextInt();


int res= removeElement(nums, val);


        System.out.println("移除后的数组"+Arrays.toString(nums));

        System.out.println(res);






    }


    public static  int removeElement( int[] nums, int val){

        if(nums==null || nums.length==0){
            return 0;
        }
        int j=0;

        for(int i=0; i<nums.length;i++)
        {
            if(nums[i]!=val)
            {
                nums[j]=nums[i];
                j++;
            }
        }
        return j;

    }


}
