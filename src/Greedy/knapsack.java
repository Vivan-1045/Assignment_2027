package Greedy;

public class knapsack {
    static int knapsack(int W, int val[], int wt[]) {
        // call helper function to compute max value for capacity W
        return knapSack(W, val, wt);
    }

    static int knapSack(int W, int[] val, int[] wt) {
        int n = val.length;
        int[][] dp = new int[n + 1][W + 1];

        // initialize dp array for 0 items or 0 capacity
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= W; j++) {
                if (i == 0 || j == 0) {
                    dp[i][j] = 0; // base case: no items or no capacity = 0 value
                }
            }
        }

        // build dp table bottom-up
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j <= W; j++) {
                if (wt[i - 1] <= j) {
                    // item can be included: choose max of including or excluding it
                    dp[i][j] = Math.max(val[i - 1] + dp[i - 1][j - wt[i - 1]], dp[i - 1][j]);
                } else {
                    // item cannot be included, exclude it
                    dp[i][j] = dp[i - 1][j];
                }
            }
        }

        // dp[n][W] contains max value for n items and capacity W
        return dp[n][W];
    }

}
