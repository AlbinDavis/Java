package problems.programs;

import java.util.Arrays;

public class MaximizeSumOfArrayAfterKNegations {
    public static void main(String[] args) {
        System.out.println(largestSumAfterKNegations(new int[]{4,-5,4,-5,9,4,5},1));
    }
    public static int largestSumAfterKNegations(int[] arr, int k) {
        Arrays.sort(arr);
        int sum = 0;
        boolean flag = false;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<0) {
                arr[i] = -arr[i];
                k--;
            }

        }
        int min= Integer.MAX_VALUE;
        for(int i:arr){
            sum+=i;
            min = Math.min(min,i);
        }

        if( k%2==0)
            return sum;
        else
            return sum-(min*2);
    }
}
