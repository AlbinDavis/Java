package com.programs;

import java.util.Arrays;

public class UniquePaths {
    public static void main(String[] args) {
        int m=3,n=3;
        int[][] mat = new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(i==0 || j==0){
                    mat[i][j]=1;
                }
                else{
                    mat[i][j]=mat[i-1][j]+mat[i][j-1];
                }
            }
        }
        System.out.println(Arrays.deepToString(mat));
        System.out.println(mat[m-1][n-1]);
    }
}
