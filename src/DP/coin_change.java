package DP;

public class coin_change {
    int[][] dp;

    public int coinChange(int[] coins, int amount) {
        dp = new int[coins.length + 1][amount + 1];
        return minCount(coins, amount); // compute minimum coins needed
    }

    int minCount(int[] coin, int amo) {
        int n = coin.length;

        // initialization for base cases
        for (int j = 1; j <= amo; j++) {
            dp[0][j] = Integer.MAX_VALUE - 1; // cannot form any amount with 0 coins
            dp[1][j] = (j % coin[0] == 0) ? j / coin[0] : Integer.MAX_VALUE - 1; // using only first coin
        }

        // fill dp table using bottom-up approach
        for (int i = 2; i <= n; i++) {
            for (int j = 1; j <= amo; j++) {
                if (coin[i - 1] <= j) {
                    // include current coin or exclude it — take the minimum
                    dp[i][j] = Math.min(dp[i][j - coin[i - 1]] + 1, dp[i - 1][j]);
                } else {
                    // cannot include current coin
                    dp[i][j] = dp[i - 1][j];
                }
            }
        }

        // return -1 if amount cannot be formed
        return dp[n][amo] == Integer.MAX_VALUE - 1 ? -1 : dp[n][amo];
    }
}
