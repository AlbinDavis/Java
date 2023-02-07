package problems.programs;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class ShortestPath {
    static int[][] directions= {{1,1},{1,-1},{-1,1},{-1,-1},{1,0},{0,1},{-1,0},{0,-1}};
    public static void main(String[] args) {
        int[][] grid = {{0,0,0},{1,0,0},{1,1,0}};
        System.out.println(shortestPathBinaryMatrix(grid));

    }
    public static boolean isValid(int[][] grid,int ni,int nj){
        int r=grid.length;
        int c=grid[0].length;
        return ni>=0&& ni<r && nj>=0 && nj<c;
    }
    public static int shortestPathBinaryMatrix(int[][] grid) {
        int R = grid.length;
        int C = grid[0].length;

        if(grid[0][0]!=0 || grid[R-1][C-1]!=0)
            return -1;
        Queue<List<Integer>> queue = new LinkedList<>();
        queue.add(List.of(0,0));
        grid[0][0]=1;
        while(!queue.isEmpty()){
            List<Integer> curr = queue.poll();
            int i=curr.get(0);
            int j=curr.get(1);
            if(i==R-1 && j==C-1)
                return grid[i][j];

            for(int k=0;k<8;k++){
                int ni=i+directions[k][0];
                int nj=j+directions[k][1];
                if(isValid(grid,ni,nj) && grid[ni][nj]==0){
                    queue.add(List.of(ni,nj));
                    grid[ni][nj]=grid[i][j]+1;
                }
            }
        }
        return -1;
    }
}
