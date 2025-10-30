package DP;

public class palindromic_substring {
    public int countSubstrings(String s) {
        // Returns the number of palindromic substrings in s
        return validPalindromeCount(s);
    }

    int validPalindromeCount(String s) {
        int count = 0;
        // Iterate over all possible substrings
        for (int i = 0; i < s.length(); i++) {
            for (int j = i; j < s.length(); j++) {
                // Check if substring s[i..j] is a palindrome
                if (checkPalindrome(s, i, j)) {
                    count++;
                }
            }
        }
        return count;
    }

    boolean checkPalindrome(String substring, int l, int r) {
        // Single character is always a palindrome
        if (l == r) {
            return true;
        }
        // Check characters from both ends moving inward
        while (l <= r) {
            if (substring.charAt(l) != substring.charAt(r)) {
                return false;
            }
            l++;
            r--;
        }
        return true;
    }
}
