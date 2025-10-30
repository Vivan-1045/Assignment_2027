package DP;

public class longest_common_palindrome {
    public int longestPalindromeSubseq(String s) {
        // Returns the length of the longest palindromic subsequence
        return longestPalind(s);
    }

    int longestPalind(String s) {
        // Reverse the input string
        String s1 = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            s1 += s.charAt(i);
        }

        int n = s1.length();
        // dp[i][j] stores LCS length between s[0..i-1] and s1[0..j-1]
        int[][] dp = new int[n + 1][n + 1];

        // Build the LCS table
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (s.charAt(i - 1) == s1.charAt(j - 1)) {
                    // Characters match → extend subsequence
                    dp[i][j] = 1 + dp[i - 1][j - 1];
                } else {
                    // Otherwise, take the longer subsequence from previous states
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
                }
            }
        }

        // dp[n][n] contains the longest palindromic subsequence length
        return dp[n][n];
    }

}
