package problems.programs;

import java.util.Arrays;

public class FirstAndLastElementInAnSortedArray {
    public static void main(String[] args) {
        int[] nums={22,5,7,7,10};
        int target = 8;
        System.out.println(Arrays.toString(searchRange(nums, target)));
    }
    public static int[] searchRange(int[] nums, int target) {

        int left=0,right=nums.length-1;
        int start =-1;
        while(left<=right){
            int mid= left+(right-left)/2;

            if(nums[mid]==target){
                start=mid;
                right = mid-1;
            }
            else if(target<nums[mid]){
                right=mid-1;
            }
            else{
                left=mid+1;
            }

        }
        left=0;
        right=nums.length-1;
        int end =-1;
        while(left<=right){
            int mid= left+(right-left)/2;

            if(nums[mid]==target){
                end=mid;
                left = mid+1;
            }
            else if(target<nums[mid]){
                right=mid-1;
            }
            else{
                left=mid+1;
            }

        }
        if(start ==-1){
            return new int[] {-1,-1};
        }
        else{
            return new int[] {start,end};
        }

    }
}
