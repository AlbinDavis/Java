package problems.programs;

import java.util.Arrays;

public class NextPermutation {
    public static void main(String[] args) {
        int[] nums = {2,4,4,2};
        //1,3,4,2,3,1,0
        int index = -1;
        int n=nums.length;
        for(int i = 1; i<nums.length;i++){
            if(nums[i]>nums[i-1]){
                index = i;
            }
        }
        if(index==-1){
            for(int i=0;i<n/2;i++){
                swap(nums,i,n-i-1);
            }
        }
        else {
            int nextIndex=index;
            for (int i = index+1; i <n; i++) {
                if (nums[i] < nums[index] && nums[i]>nums[index-1]) {
                    nextIndex=i;
                }
            }
            swap(nums,index-1,nextIndex);
            Arrays.sort(nums, index, nums.length);
        }
        System.out.println(Arrays.toString(nums));
    }
    public static void swap(int[] nums,int first,int last){
        int temp = nums[first];
        nums[first] = nums[last];
        nums[last] = temp;
    }
}
