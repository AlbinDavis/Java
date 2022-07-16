package com.programs;

public class MoveZeros {
    public static void main(String[] args) {
        int[] arr = {4, 2, 4, 0, 0, 3, 0, 5, 1, 0};
        int i = 0;
        int j = 0;
        while (j < arr.length) {
            if (arr[i] != 0) {
                i++;
                j = i + 1;
                continue;
            }
            if (arr[j] == 0) {
                j++;
                continue;
            }
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j++;
        }
        for (int k : arr) {
            System.out.println(k);
        }
    }
}
