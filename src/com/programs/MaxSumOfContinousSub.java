package com.programs;

public class MaxSumOfContinousSub {
    public static void main(String[] args)
    {
        Integer [] nums= {1,2,3,4,5};
        int max=Integer.MIN_VALUE;
        int max2=0;
        for(Integer i:nums){
            max2+=i;
            if(max<max2){
                max=max2;
            }
            if(max2<0){
                max2=0;
            }
        }
        System.out.println(max);
    }
}
