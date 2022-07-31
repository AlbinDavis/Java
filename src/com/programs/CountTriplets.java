package com.programs;

import java.util.HashSet;
import java.util.Set;

public class CountTriplets {
    public static void main(String[] args) {
        int[] arr= {1, 5, 3, 2,4};
        Set<Integer> set = new HashSet<>();
        for(int i:arr){
            set.add(i);
        }
        int count=0;
        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;j<arr.length;j++){
                if(set.contains(arr[i]+arr[j])){
                   count++;
                }
            }
        }
        System.out.println(count);
    }
}
