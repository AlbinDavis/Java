package problems.programs;

import java.util.Arrays;

public class Convert1Dto2DArray {
    public static void main(String[] args) {
        int m=2;
        int n =2;
        int[] original = {1,2,3,4};

        if(original.length!=m*n)
            System.out.println(Arrays.deepToString(new int[][]{}));
        int k=0;
        int[][] matrix = new int[m][n];
        int col=0;
        int row =0;
        for(int i=0;i<original.length;i++) {
            matrix[row][col] = original[i];
            col++;
            if (col == n) {
                col = 0;
                row++;
            }
        }
            System.out.println(Arrays.deepToString(matrix));

    }
}
