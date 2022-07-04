package com.programs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SubArrayWithGIvenSum {

    public static void main(String[] args) {
        int[] arr =
                //{1 ,2, 13, 5 ,7};
                // {1,2,3,7,5};
                {1, 8,4,5,6,3,9};
        int s = 8;
        int startIndex = 0;
        int sum = arr[0];
        int i = 1;
        while (i < arr.length) {

            sum += arr[i];


            while (sum > s) {
                sum -= arr[startIndex];
                startIndex += 1;
            }
            if (sum == s) {
                break;
            }
            i += 1;
        }
        if(s==sum){
        System.out.println(Arrays.asList(startIndex + 1, i + 1));}
        else{
            System.out.println("not found");
        }
    }
}
