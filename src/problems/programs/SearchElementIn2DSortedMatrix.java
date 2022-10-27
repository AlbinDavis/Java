package problems.programs;

public class SearchElementIn2DSortedMatrix {
    public static void main(String[] args) {
        int target = 5;
        int[][] matrix =
                {{1, 4, 7, 11, 15}, {2, 5, 8, 12, 19}, {3, 6, 9, 16, 22}, {10, 13, 14, 17, 24}, {18, 21, 23, 26, 30}};
        int i = 0;
        int j = matrix[0].length - 1;
        while (j > 0) {
            if (target == matrix[i][j]) {
                System.out.println(true);
                System.exit(1);
            }
            if(matrix[i][j]>target){
                j--;
            }
            i++;
        }
        System.out.println(false);
    }
}
