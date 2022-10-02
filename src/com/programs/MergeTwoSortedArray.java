//https://leetcode.com/problems/merge-sorted-array/submissions/812073177/
package com.programs;

import java.util.Arrays;
import java.util.TreeMap;

// we will have 3 pointers
// one pointer k and back of first array j at back of second array and pointer i at the first array before the 0 starts;
// we have to compare the nums1[i] and nums2[j] array values.
// value which is greater we will assign it to the array of val k increment that value
// if any value left in the second array we will add that to the first array
public class MergeTwoSortedArray {
    public static void main(String[] args) {
        int [] nums1 = {1, 2, 3, 0, 0, 0}, nums2 = {2, 5, 6};
        int k=nums1.length-1;
        int i=nums1.length-nums2.length-1;
        int j=nums2.length-1;
        while(j>=0 && i >=0)
        {
            if(nums1[i]>=nums2[j])
            {
                nums1[k]=nums1[i];
                k--;
                i--;
            }
            else{
                nums1[k]=nums2[j];
                j--;
                k--;
            }
        }
        while(j>=0){
            nums1[k]=nums2[j];
            j--;
            k--;
        }
        System.out.println(Arrays.toString(nums1));
    }

}

