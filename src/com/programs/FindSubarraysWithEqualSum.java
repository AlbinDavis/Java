package com.programs;

import java.util.HashMap;

public class FindSubarraysWithEqualSum {
    public static void main(String[] args) {
    int[] arr = {4, 2, 4};
        System.out.println(findSubarrays(arr));
    }
    public static boolean findSubarrays(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums.length-1;i++)
        {
            map.put(nums[i]+nums[i+1],map.getOrDefault(i,0)+1);
        }
        for(int i:map.values())
        {
            if(i>1)
                return true;
        }
        return false;
    }
}
