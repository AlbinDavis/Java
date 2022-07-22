package com.programs;

import java.util.Arrays;

public class NumMatrix {
    int[][] matrix;
    int[][] prefixsum;

    public NumMatrix(int[][] matrix) {
        this.matrix = matrix;
        this.prefixsum = prefixSum(matrix);
    }

    public int sumRegion(int row1, int col1, int row2, int col2) {
        if(row1 == 0 && col1==0){
            return prefixsum[row2][col2];

        }
        if(row1 == 0){
            return prefixsum[row2][col2]-prefixsum[row2][col1-1];

        }
        if(col1==0){
            return prefixsum[row2][col2]-prefixsum[row1-1][col2];
        }


        return prefixsum[row2][col2]-prefixsum[row1-1][col2]-prefixsum[row2][col1-1]+
                prefixsum[row1-1][col1-1];
    }

    public int[][] prefixSum(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            int sum = 0;
            for (int j = 0; j < matrix[0].length; j++) {
                sum = sum + matrix[i][j];
                matrix[i][j] = sum;
            }
        }
        System.out.println(Arrays.deepToString(matrix));
        for (int i = 1; i < matrix.length; i++) {
            int sum = 0;
            for (int j = 0; j < matrix[0].length; j++) {
                sum = matrix[i][j] + matrix[i - 1][j];
                matrix[i][j] = sum;
            }
        }
        System.out.println(Arrays.deepToString(matrix));
        return matrix;
    }


}
