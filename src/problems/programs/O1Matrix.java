package problems.programs;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class O1Matrix {
    static int[][] direction = {{-1, 0}, {0, 1}, {1, 0}, {0, -1}};
    private static boolean isValid(int[][] grid, int ni, int nj) {
        return ni >= 0 && ni < grid.length && nj < grid[0].length && nj >= 0;
    }
    public static void main(String[] args) {

        int[][] grid = {{0,0,0}, {0,1,0}, {1,1,1}};
        Queue<List<Integer>> queue = new LinkedList<>();
        int c = grid[0].length;
        int r = grid.length;
        for(int i=0;i<r;i++) {
            for (int j = 0; j < c; j++) {
                if (grid[i][j] == 0) {
                    queue.add(List.of(i, j));
                } else
                    grid[i][j] = -1;
            }
        }
            while(!queue.isEmpty()){
                List<Integer> curr= queue.poll();
                int row = curr.get(0);
                int col = curr.get(1);
                for(int k=0;k<4;k++){
                    int ni=row + direction[k][0];
                    int nj=col + direction[k][1];
                    if(isValid(grid,ni,nj) && grid[ni][nj]==-1){
                        grid[ni][nj]=grid[row][col]+1;
                        queue.add(List.of(ni,nj));
                    }
                }
            }
        System.out.println(Arrays.deepToString(grid));
        }
    }

