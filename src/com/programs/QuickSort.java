package com.programs;

import java.util.Arrays;

import static com.programs.NextPermutation.swap;

public class QuickSort {
    public static void main(String[] args) {
        int[] arr= {4,1,3,9,7};
        quickSort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));

    }

    private static void quickSort(int[] arr, int i, int j) {
        if(i>=j)
            return;
        int index = partition(arr,i,j);
        quickSort(arr,i,index-1);
        quickSort(arr,index+1,j);
    }

    private static int partition(int[] arr,int low,int high){
        int pivot = arr[high];

        // Index of smaller element and
        // indicates the right position
        // of pivot found so far
        int i = (low - 1);

        for(int j = low; j <= high - 1; j++)
        {

            // If current element is smaller
            // than the pivot
            if (arr[j] < pivot)
            {

                // Increment index of
                // smaller element
                i++;
                swap(arr, i, j);
            }
        }
        swap(arr, i + 1, high);
        return (i + 1);
    }
}
