package problems.programs;

public class GraphArrayDFS {
    static int[][] direction ={{-1,0},{0,1},{1,0},{0,-1}};
    public static void main(String[] args) {
        int count=0;
        int [][] grid = {{1,0,1,0},{1,1,0,1},{1,1,0,1},{1,0,1,1}};
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]==1){
                    dfs(grid,i,j);
                    count++;
                }
            }
        }
        System.out.println(count);
    }
    private static void dfs(int[][] grid,int i,int j){
        //making i and j as visited
        grid[i][j]=0;

        //start exploring neighbour
        for(int k=0;k<4;k++){
            int ni=i+direction[k][0];
            int nj=j+direction[k][1];
            if(isValid(grid,ni,nj) && grid[ni][nj]==1){
                dfs(grid,ni,nj);
            }
        }
    }

    private static boolean isValid(int[][] grid,int ni, int nj) {
        return ni>=0 && ni<grid.length && nj<grid[0].length && nj>=0;
    }
}
