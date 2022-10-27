package problems.programs;

import java.util.Arrays;

public class SpecialPositionsInBinaryMatrix {
    public static void main(String[] args) {
        int[][] mat ={{0,0,1,0},{0,0,0,0},{0,0,0,0},{0,1,0,0}};
        int[] row = new int[mat.length];
        int[] col = new int[mat[0].length];
        for(int i =0;i<mat.length;i++){
            for(int j=0;j<mat[0].length;j++){
                if(mat[i][j] == 1){
                    row[i]+=mat[i][j];
                    col[j]+=mat[i][j];
                }
            }
        }
        System.out.println(Arrays.toString(row) + Arrays.toString(col));
        int sum =0;
        for(int i =0;i<mat.length;i++) {
            for (int j = 0; j < mat[0].length; j++) {
                if(mat[i][j] == 1){
                    if((row[i]==1) && (col[j]==1)){
                        sum+=1;
                    }
                }
            }
        }
        System.out.println(sum);
    }
}
