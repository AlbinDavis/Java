package com.programs;

public class MaxChunksToMakeSorted {
    public static void main(String[] args) {
        int[] arr ={1,3,0,2,4};
        int max = Integer.MIN_VALUE;
        int count =0;
        for(int i=0;i<arr.length;i++){
            max=Math.max(max,arr[i]);
            if(max==i){
                count++;
            }
        }
        System.out.println(count);
    }
}
