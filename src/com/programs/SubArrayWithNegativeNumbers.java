package com.programs;

import java.util.*;

public class SubArrayWithNegativeNumbers {
    public static void main(String[] args) {

        int k = 2;
        int[] arr = {3,4,7,2,-3,1,4,2};
        if (arr.length == 0)
            System.out.println(0);
        else {
            Map<Integer, Integer> prefixCountMap = new HashMap<>();
            int sum = 0;
            int count = 0;
            for (int i = 0; i < arr.length; i++) {
                sum += arr[i];
                if (sum == k) {
                    count++;
                }

                if (prefixCountMap.containsKey(sum - k)) {
                    count += prefixCountMap.get(sum - k);

                }
                prefixCountMap.put(sum, prefixCountMap.getOrDefault(sum, 0) + 1);
            }
            System.out.println(count);
        }

    }
}
