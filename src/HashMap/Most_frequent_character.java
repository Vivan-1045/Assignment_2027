package HashMap;

public class Most_frequent_character {
    public char getMaxOccuringChar(String s) {
        // To store frequencies of characters a-z
        char ch = 'a';
        int[] freq = new int[26];  // Only lowercase letters assumed

        // Count frequency of each character
        for (char c : s.toCharArray()) {
            freq[c - 'a']++;
        }

        int maxFreq = -1;

        // Find the character with the highest frequency
        for (int i = 0; i < 26; i++) {
            if (freq[i] != 0 && maxFreq < freq[i]) {
                ch = (char)(i + 'a');  // Convert index back to character
                maxFreq = freq[i];
            }
        }

        return ch;  // Return the most frequent character
    }

}
