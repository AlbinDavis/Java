package problems.programs;

public class SumOfAllSubMatrixOfAnMatrix {
    public static void main(String[] args) {
        int[][] nums = {{1, 1, 1},
                {1, 1, 1},
                {1, 1, 1}};
        int row = nums.length;
        int col = nums[0].length;
        int sum = 0;
        for(int i=0;i<row ;i++){
            for(int j=0;j<col;j++){
                int top_left = (i + 1) * (j + 1);
                int bottom_right = (row - i) * (col - j);
                sum += (top_left * bottom_right * nums[i][j]);
            }
        }
        System.out.println(sum);



/** naive approch time complexity O(n^6)
 *
 *
 for(int top=0; top < row; top++)
 {
 for(int left=0;left<col;left++)
 {
 for(int bottom=top;bottom<row;bottom++)
 {
 for(int right=left;right<col;right++)
 {
 //System.out.println("top_left:"+top+","+left+":"+"BR:"+bottom+":"+right);
 for(int i=top;i<=bottom;i++)
 {
 for(int j=left;j<=right;j++)
 {
 sum+=nums[i][j];
 }
 }

 }
 }
 }
 }
 System.out.println(sum);
 **/
    }
}
