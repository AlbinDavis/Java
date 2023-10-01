package problems.programs;

public class SubSetSumEqualsK {
    public static void main(String[] args) {
        int sum = 31;
        int[] arr = new int[]{9, 7, 0, 3, 9, 8, 6, 5, 7, 6};
        int n = arr.length;
        int[][] dp = new int[n + 1][sum + 1];
        for (int i = 0; i < n + 1; i++) {
            for (int j = 0; j < sum + 1; j++) {
                dp[i][j] = -1;
            }
        }
        System.out.println(countSubsetSum(arr, n - 1, sum, dp) % (10 ^ 9 + 7));
    }

    public static int countSubsetSum(int[] arr, int n, int sum, int[][] dp) {
        if (sum == 0) {
            return 1;
        }
        if (n < 0 || sum < 0) {
            return 0;
        }

        if (arr[n] > sum)
            return countSubsetSum(arr, n - 1, sum, dp);
        return countSubsetSum(arr, n - 1, sum, dp) + countSubsetSum(arr, n - 1, sum - arr[n], dp);
    }
}
