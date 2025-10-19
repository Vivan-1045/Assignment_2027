package HashMap;

import java.util.HashSet;
import java.util.Set;

public class longest_substring_without_repeating_character {
    public int lengthOfLongestSubstring(String s) {
        return maxLengthSubstring(s);
    }
    int maxLengthSubstring(String s) {
        Set<Character> st = new HashSet<>(); // Stores unique characters in current window
        int i = 0, j = 0, n = s.length(), ans = 0;

        while (j < n) {
            if (!st.contains(s.charAt(j))) {
                st.add(s.charAt(j)); // Add new unique character to the set
                ans = Math.max(ans, j - i + 1); // Update max length if current window is larger
                j++; // Expand window
            } else {
                st.remove(s.charAt(i)); // Remove character at start to resolve duplicate
                i++; // Shrink window from left
            }
        }

        return ans; // Return length of longest substring without repeating characters
    }
}
