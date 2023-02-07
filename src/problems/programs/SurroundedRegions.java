package problems.programs;

import java.util.Arrays;

import static problems.programs.ShortestPath.directions;

public class SurroundedRegions {
    static int[][] direction = {{-1, 0}, {0, 1}, {1, 0}, {0, -1}};
    private static boolean isValid(char[][] grid, int ni, int nj) {
        return ni >= 0 && ni < grid.length && nj < grid[0].length && nj >= 0;
    }
    public static void main(String[] args) {
        char[][] board = {{'X', 'O', 'X', 'O', 'X', 'O'}, {'O', 'X', 'O', 'X', 'O', 'X'}, {'X', 'O', 'X', 'O', 'X', 'O'}, {'O', 'X', 'O', 'X', 'O', 'X'}};
        solve(board);
        System.out.println(Arrays.deepToString(board));
    }
    public static void solve(char[][] board) {
        int R= board.length;
        int C = board[0].length;

        for(int i=0;i<R;i++){
            for(int j=0;j<C;j++){
              if((i==0 || j==0 || j==C-1 || i== R-1)&& board[i][j]=='O'){
                  dfs(board,i,j);
              }
            }
        }
        System.out.println(Arrays.deepToString(board));

        for(int i=0;i<R;i++){
            for(int j=0;j<C;j++) {
                if(board[i][j]=='O')
                    board[i][j]='X';
                else if(board[i][j]=='#')
                    board[i][j]='O';
            }
            }
    }

    private static void dfs(char[][] board, int i, int j) {
        board[i][j]='#';
        for(int k=0;k<4;k++){
            int ni=i+direction[k][0];
            int nj=j+direction[k][1];
            if(isValid(board,ni,nj) && board[ni][nj]=='O'){
                dfs(board,ni,nj);
            }
        }
    }
}
