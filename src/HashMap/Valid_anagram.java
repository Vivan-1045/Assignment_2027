package HashMap;

public class Valid_anagram {
    public boolean isAnagram(String s, String t) {
        return isAnaGram(s, t);
    }

    boolean isAnaGram(String s, String t) {
        int[] freq = new int[26];   // Frequency array for string s
        int[] freq1 = new int[26];  // Frequency array for string t

        // Only proceed if strings have same length (necessary for anagrams)
        if (s.length() == t.length()) {
            // Count frequency of each character in s
            for (char ch : s.toCharArray()) {
                freq[ch - 'a']++;
            }

            // Count frequency of each character in t
            for (char ch : t.toCharArray()) {
                freq1[ch - 'a']++;
            }

            // Compare frequency arrays; if any mismatch, not an anagram
            for (int i = 0; i < 26; i++) {
                if (freq[i] != freq1[i]) {
                    return false;
                }
            }

            return true;  // All frequencies match, strings are anagrams
        }

        return false;  // Different lengths => cannot be anagrams
    }

}
