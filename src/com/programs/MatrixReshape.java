package com.programs;

import java.util.Arrays;

public class MatrixReshape {
    public static void main(String[] args) {
        int[][] mat={{1,2},{3,4}};
        int r = 1, c = 4;
        if(r*c != mat.length*mat[0].length){
            System.out.println(mat);
        }
        int[][] mat2 = new int[r][c];
        int k=0,q=0;
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[0].length;j++){
                mat2[k][q]=mat[i][j];
                q++;
                if(q==mat2[0].length){
                    q=0;
                    k++;

                }
            }
        }


        System.out.println(Arrays.deepToString(mat2));
    }
}
