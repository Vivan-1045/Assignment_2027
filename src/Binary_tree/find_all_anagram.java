package Binary_tree;

import java.util.ArrayList;
import java.util.List;

public class find_all_anagram {
    public List<Integer> findAnagrams(String s, String p) {
        // Delegate to helper method to find all starting indices of anagrams
        return allAnagram(s, p);
    }

    List<Integer> allAnagram(String s, String p) {
        int n = p.length();
        List<Integer> ans = new ArrayList<>();

        // Slide a window of size 'n' across string 's'
        for (int i = 0; i < s.length(); i++) {
            // Ensure the substring stays within bounds
            if (i + n - 1 < s.length() && isAnagram(s.substring(i, i + n), p)) {
                // If substring is an anagram of 'p', store the starting index
                ans.add(i);
            }
        }

        return ans;
    }

    boolean isAnagram(String s1, String s2) {
        // Frequency array for 26 lowercase letters
        int[] freq = new int[26];

        // Increment for characters in s1 and decrement for s2
        for (int i = 0; i < s1.length(); i++) {
            freq[s1.charAt(i) - 'a']++;
            freq[s2.charAt(i) - 'a']--;
        }

        // If all frequencies are zero, the strings are anagrams
        for (int num : freq) {
            if (num != 0) {
                return false;
            }
        }

        return true;
    }

}
