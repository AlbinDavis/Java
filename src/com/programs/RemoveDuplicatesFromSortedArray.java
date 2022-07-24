package com.programs;

import java.util.Arrays;

public class RemoveDuplicatesFromSortedArray {
    public static void main(String[] args) {
        int[] arr = {1, 1, 2, 2, 3, 4};
        int count=1;
        for(int j=1;j<arr.length;j++) {
            if (arr[j] != arr[j - 1]) {
                arr[count++] = arr[j];
            }
        }
        System.out.println(count);
        System.out.println(Arrays.toString(arr));
    }
}
