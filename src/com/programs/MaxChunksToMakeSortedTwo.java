package com.programs;

import java.util.Arrays;

public class MaxChunksToMakeSortedTwo {
    public static void main(String[] args) {
        int[] arr ={0,3,0,3,2};
        int[] sorted=arr.clone();
        Arrays.sort(sorted);
        int max = Integer.MIN_VALUE;
        int count =0;
        for(int i=0;i<arr.length;i++){
            max=Math.max(max,arr[i]);
            if(max==sorted[i]){
                count++;
            }
        }
        System.out.println(count);
    }
}
