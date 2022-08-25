package com.programs;

import java.util.Arrays;

public class InversionCount {
    static int count = 0;
    // Merges two subarrays of arr[].
    // First subarray is arr[l..m]
    // Second subarray is arr[m+1..r]
    static void merge(int arr[], int l, int m, int r)
    {
        // Find sizes of two subarrays to be merged

        /* Create temp arrays */
        int left[] = Arrays.copyOfRange(arr,l,m+1);
        int right[] = Arrays.copyOfRange(arr,m+1,r+1);

        int i = 0, j = 0;

        // Initial index of merged subarray array
        int k = l;
        while (i < left.length && j < right.length) {
            if (left[i] <= right[j]) {
                arr[k] = left[i];
                i++;
            }
            else {
                count+=left.length-i;
                arr[k] = right[j];
                j++;
            }
            k++;
        }

        /* Copy remaining elements of L[] if any */
        while (i < left.length) {
            arr[k] = left[i];
            i++;
            k++;
        }

        /* Copy remaining elements of R[] if any */
        while (j < right.length) {
            arr[k] = right[j];
            j++;
            k++;
        }
    }

    // Main function that sorts arr[l..r] using
    // merge()
    static void sort(int arr[], int l, int r)
    {
        if (l < r) {
            // Find the middle point
            int m =l+ (r-l)/2;

            // Sort first and second halves
            sort(arr, l, m);
            sort(arr, m + 1, r);

            // Merge the sorted halves
            merge(arr, l, m, r);
        }
    }

    /* A utility function to print array of size n */
    static void printArray(int arr[])
    {
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");

    }

    // Driver code
    public static void main(String args[])
    {
        int arr[] = {174, 165, 142, 212 ,254 ,369, 48 ,145, 163, 258 ,38 ,360, 224 ,242 ,30, 279,
                317, 36 ,191, 343 ,289 ,107, 41, 443 ,265, 149, 447 ,306, 391, 230 ,371 ,351, 7 ,102};

        sort(arr, 0, arr.length - 1);
        System.out.println(count);
        printArray(arr);
    }
}
