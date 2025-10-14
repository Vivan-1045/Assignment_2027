package Recurrsion;

import java.util.Arrays;

public class fibbonacci_number {
    public int nthFibonacci(int n) {
        // Create a memoization array to store already computed results
        dp = new int[n + 1];
        Arrays.fill(dp, -1);  // Initialize all values with -1 (meaning not calculated yet)
        return nthFib(n);
    }

    int[] dp;

    int nthFib(int n) {
        // Base case: 0th Fibonacci number is 0
        if (n == 0) {
            return 0;
        }

        // Base case: 1st and 2nd Fibonacci numbers are 1
        if (n <= 2) {
            return 1;
        }

        // If we've already calculated Fibonacci(n), return it
        if (dp[n] != -1) {
            return dp[n];
        }

        // Otherwise, calculate and store it
        return dp[n] = nthFib(n - 1) + nthFib(n - 2);
    }

}
