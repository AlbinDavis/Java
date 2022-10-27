package problems.programs;

import java.util.Arrays;

import static problems.programs.NextPermutation.swap;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr= {5,4,3,2,1};
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length-i-1;j++){
                if(arr[j]>arr[j+1]){
                    swap(arr,j,j+1);
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
