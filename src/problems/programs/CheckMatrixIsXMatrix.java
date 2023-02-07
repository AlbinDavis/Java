package problems.programs;

public class CheckMatrixIsXMatrix {
    public static void main(String[] args) {
        System.out.println(
                checkXMatrix(new int[][]{{2, 0, 0, 1}, {0, 3, 1, 0}, {0, 5, 2, 0}, {4, 0, 0, 2}})
        );
    }
    public static boolean checkXMatrix(int[][] arr) {
        int k = arr.length-1;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                if(i==j || j==(k-i))
                {
                    if(arr[i][j]==0)
                        return false;
                }
                else if(arr[i][j]!=0)
                    return false;
            }
        }
        return true;
    }
}
