package com.programs;

import java.util.HashMap;
import java.util.Map;

public class ContainsDuplicate2 {
    public static void main(String[] args) {

        boolean result = containsNearbyDuplicate(new int[]{1, 0, 1, 1},1);
        System.out.println(result);
    }
    public static boolean containsNearbyDuplicate(int[] nums, int k) {
        Map<Integer,Integer> map = new HashMap<>();

        for(int i=0;i<nums.length;i++)
        {
            Integer previousValue= map.put(nums[i],i);
            if(previousValue != null && Math.abs(i-previousValue)<=k){
                return true;
            }
        }
        return false;
    }
}
