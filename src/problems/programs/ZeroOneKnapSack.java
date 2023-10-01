package problems.programs;

import java.util.Arrays;

/*
You are given weights and values of N items, put these items in a knapsack of capacity W to get the maximum total value in the knapsack. Note that we have only one quantity of each item.
In other words, given two integer arrays weight[0..N-1] and profit[0..N-1] which represent values and weights associated with N items respectively. Also given an integer W which represents knapsack
capacity, find out the maximum value subset of profit[] such that sum of the weights of this subset is smaller than or equal to W. You cannot break an item, either pick the complete item or don't pick it (0-1 property).
 */
public class ZeroOneKnapSack {
    public static void main(String[] args) {
        int[] weight = {4, 3, 2};
                //57,95,13,29,1,99,34,77,61,23,24,70,73,88,33,61,43,5,41,63,8,67,20,72,98,59,46,58,64,94,97,70,46,81,42,7,1,52,20,54,81,3,73,78,81,11,41,45,18,94,24,82,9,19,59,48,2,72};
        int[] profit = {5, 4, 6};
                //{83,84,85,76,13,87,2,23,33,82,79,100,88,85,91,78,83,44,4,50,11,68,90,88,73,83,46,16,7,35,76,31,40,49,65,2,18,47,55,38,75,58,86,77,96,94,82,92,10,86,54,49,65,44,77,22,81,52};
        int W = 7;//capacity of the bag
        int[][] memo = new int[W + 1][weight.length + 1];
        for(int i=0;i<memo.length;i++){
            for(int j=0;j<memo[0].length;j++){
                memo[i][j]=-1;
            }
        }
        int result = knapSack(memo, weight, profit, W, weight.length-1);
        System.out.println(Arrays.deepToString(memo));
        int res = knapSack(weight,profit, W, weight.length);
        System.out.println(res);
        System.out.println(result);
    }

    //If bag size = 3 and no of items = 4 that means when bag size is 3 and 4 items can be added to bag then the max profit is memo[bagSize][noOfItems]
    private static int knapSack(int[][] memo, int[] weight, int[] profit, int bagSize, int noOfItems) {
        if (bagSize == 0 || noOfItems < 0)
            return 0;
        if (memo[bagSize][noOfItems] != -1)
            return memo[bagSize][noOfItems];
        if (weight[noOfItems] > bagSize)
            return knapSack(memo, weight, profit, bagSize, noOfItems - 1);
        return memo[bagSize][noOfItems] = Math.max(knapSack(memo, weight, profit, bagSize, noOfItems - 1), profit[noOfItems] + knapSack(memo, weight, profit, bagSize - weight[noOfItems], noOfItems - 1));
    }

    //Iterative
    private static int knapSack(int[] weight, int[] profit, int W, int N){
        int[][] dp = new int[N + 1][W + 1];
        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= W; j++) {
                if (weight[i - 1] > j)
                    dp[i][j]=dp[i-1][j];
                else
                    dp[i][j]=Math.max(dp[i-1][j],profit[i-1]+dp[i-1][j-weight[i-1]]);
            }
        }
        return dp[weight.length][W];
    }
}

