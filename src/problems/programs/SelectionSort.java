package problems.programs;

import java.util.Arrays;

import static problems.programs.NextPermutation.swap;

public class SelectionSort {
    public static void main(String[] args) {
        int[] nums = {5,4,3,2,1};
        for(int i=0;i<nums.length-1;i++){
            int temp=i;
            for(int j=0;j<nums.length-i-1;j++){
                if(nums[j]<nums[i])
                    temp=j;
            }
            swap(nums,i,temp);
        }
        System.out.println(Arrays.toString(nums));
    }

}
