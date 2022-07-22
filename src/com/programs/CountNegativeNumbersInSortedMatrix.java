package com.programs;

public class CountNegativeNumbersInSortedMatrix {
    public static void main(String[] args) {
        int[][] grid= {{ 4, 3, 2,-1},
                       { 3, 2, 1,-1},
                       { 1, 1,-1,-2},
                       {-1,-1,-2,-3}
                      };
        int row = grid.length-1;
        int col= grid[0].length-1;
        int count =0;
        while(col>=0){
            if(grid[row][col]<0){
                count+=1;
                if(row!=0){
                    row--;
                }
                else{
                    row=grid.length-1;
                    col--;
                }
            }
            else{
                row=grid.length-1;
                col--;
            }
        }
        System.out.println(count);
    }
}
