package com.programs;

public class TrappingRainWater {
    public static void main(String[] args) {
        int[] arr= {4,2,0,3,2,5};
        int right_max = 0;
        int[] rightMaxArray = new int[arr.length];
        for(int i=arr.length-1;i>=0;i--){
            rightMaxArray[i]=right_max;
            if(arr[i] > right_max){
                right_max = arr[i];
            }
        }

        int total_water = 0;
        int left_max = arr[0];

        for(int i=1;i<arr.length;i++){
            int min = Math.min(left_max,rightMaxArray[i]);
            int height = min - arr[i];
            if(height>0){
                total_water+=height;
            }
            if(arr[i]>left_max){
                left_max = arr[i];
            }

        }
        System.out.println(total_water);
    }
}
