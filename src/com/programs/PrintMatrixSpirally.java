package com.programs;

import java.util.ArrayList;
import java.util.List;

public class PrintMatrixSpirally {
    public static void main(String[] args) {

        int[][] arr = {{1, 2, 3}, {5, 6, 7}, {9, 10, 11}, {13, 14, 15}};
        int top = 0;
        int bottom = arr.length - 1;
        int right = arr[0].length - 1;
        int left = 0;
        int dir = 0;
        List<Integer> list = new ArrayList<>();
        while (top <= bottom && left <= right) {
            if (dir == 0) {
                for (int i = left; i <= right; i++) {
                    list.add(arr[top][i]);
                }
                top += 1;
            } else if (dir == 1) {
                for (int i = top; i <= bottom; i++) {
                    list.add(arr[i][right]);
                }
                right -= 1;
            } else if (dir == 2) {
                for (int i = right; i >= left; i--) {
                    list.add(arr[bottom][i]);
                }
                bottom -= 1;
            } else if (dir == 3) {
                for (int i = bottom; i >= top; i--) {
                    list.add(arr[i][left]);
                }
                left += 1;
            }
            dir = (dir + 1) % 4;

        }
        System.out.println(list);
    }
}
