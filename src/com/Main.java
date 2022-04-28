package com;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @author 终极庆庆
 * @version 1.0
 * @date 2022/4/3 15:48
 */
public class Main implements InvocationHandler {


    public int removeElement( int[] nums, int val){

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


    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        return null;
    }
}
