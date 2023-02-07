package problems.programs;

import java.util.Arrays;

public class RodCutting {

    public static void main(String[] args) {
        int[] price = {1 ,5 ,8 ,9 ,10 ,17 ,17 ,20};
        int n = 8;
        int[] dp = new int[n];
        Arrays.fill(dp,-1);
        int result =  cutRod(price,n,dp);
        System.out.println(result);
    }
    public static int cutRod(int[] price, int n, int[] dp) {
        if(n==0)
            return 0;
        if(dp[n-1]!=-1)
            return dp[n-1];
        int result = Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            int p = price[i]+cutRod(price,n-i-1, dp);
            result = Math.max(result,p);
        }
        dp[n-1]=result;
        return result;
    }
}
