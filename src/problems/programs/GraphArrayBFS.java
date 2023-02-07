package problems.programs;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class GraphArrayBFS {
    static int[][] direction = {{-1, 0}, {0, 1}, {1, 0}, {0, -1}};

    public static void main(String[] args) {
        int count =0;
        int[][] grid = {{1, 0, 1, 0}, {1, 1, 0, 1}, {1, 1, 0, 1}, {1, 0, 1, 1}};
        Queue<List<Integer>> queue = new LinkedList<>();
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if(grid[i][j]==1){
                    queue.add(List.of(i,j));
                    bfs(grid,i,j,queue);
                    count++;
                }
            }
        }
        System.out.println(count);
    }

    private static void bfs(int[][] grid, int i, int j, Queue<List<Integer>> queue) {
        while(!queue.isEmpty()){
            List<Integer> curr = queue.poll();
            for(int k=0;k<4;k++){
                int ni=curr.get(0)+direction[k][0];
                int nj=curr.get(1)+direction[k][1];
                if(isValid(grid,ni,nj)&&grid[ni][nj]==1){
                    queue.add(List.of(ni,nj));
                    grid[ni][nj]=0;
                }
            }
        }
    }


    private static boolean isValid(int[][] grid, int ni, int nj) {
        return ni >= 0 && ni < grid.length && nj < grid[0].length && nj >= 0;
    }
}
