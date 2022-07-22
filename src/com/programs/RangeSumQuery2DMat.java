package com.programs;

public class RangeSumQuery2DMat {
    public static void main(String[] args) {
        int[][] matrix =  {{7,7,0},{-4,-7,7},{-4,0,-2},{-8,-5,6}};
        NumMatrix numMatrix = new NumMatrix(matrix);
        int sum = numMatrix.sumRegion(1,0,2,2);
        System.out.println(sum);
    }
}
