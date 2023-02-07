package problems.programs;

import java.util.BitSet;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class CheckEveryRowColumnContainsAllNumbers {
    public static void main(String[] args) {
        boolean result = checkValid(new int[][]{
            {
                1,2,4,3
            },{
                2,3,1,4
            },{
                3,4,2,1
            },{
                4,1,3,2
        }});
        System.out.println(result);
    }
    public static boolean checkValid(int[][] arr) {
        int k=arr.length;
        Set<Integer> rowSet = new HashSet<>();
        Set<Integer> colSet = new HashSet<>();

        for(int i=0;i<arr.length;i++){
            rowSet.clear();
            colSet.clear();
            for(int j=0;j<k;j++){
                rowSet.add(arr[i][j]);
                colSet.add(arr[j][i]);
            }
            if(rowSet.size()!=k || colSet.size()!=k)
                return false;
        }
        return true;
    }
}
