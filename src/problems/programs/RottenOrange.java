package problems.programs;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class RottenOrange {
    static int[][] direction = {{-1, 0}, {0, 1}, {1, 0}, {0, -1}};
    public static void main(String[] args) {
        int[][] grid = {{1}, {2}, {1}, {2}};
        System.out.println(orangesRotting(grid));
    }

    public static int orangesRotting(int[][] grid) {
        Queue<List<Integer>> queue = new LinkedList<>();
        int min=-1;
        int fresh =0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == 2) {
                    queue.add(List.of(i,j));
                }
                else if(grid[i][j]==1){
                    fresh++;
                }
            }
        }
        if(fresh==0 && queue.isEmpty()){
            return 0;
        }
        if(queue.isEmpty()){
            return -1;
        }
        while(!queue.isEmpty()){
            int size =queue.size();
            while(size-->0){
                List<Integer> curr = queue.poll();
                if(curr!=null) {
                    for(int k=0;k<4;k++){
                        int ni=curr.get(0)+direction[k][0];
                        int nj = curr.get(1)+direction[k][1];
                        if (isValid(grid,ni,nj) && grid[ni][nj] == 1) {
                            grid[ni][nj] = 2;
                            fresh--;
                            queue.add(List.of(ni,nj));
                        }
                    }

                }
            }
            min++;
        }
        if(fresh>0)
            return -1;
        else return min;
    }
    private static boolean isValid(int[][] grid, int ni, int nj) {
        return ni >= 0 && ni < grid.length && nj < grid[0].length && nj >= 0;
    }
}
