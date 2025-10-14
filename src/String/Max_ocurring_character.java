package String;

public class Max_ocurring_character {

    public char getMaxOccuringChar(String s) {
        // Variable to store the result character
        char ch = 'a';

        // Array to store frequency of each letter (a-z)
        int[] freq = new int[26];

        // Count frequency of each character in the string
        for (char c : s.toCharArray()) {
            freq[c - 'a']++;
        }

        int freq1 = -1;

        // Find the character with the highest frequency
        for (int i = 0; i < 26; i++) {
            if (freq[i] != 0 && freq1 < freq[i]) {
                ch = (char)(i + 'a');  // Convert index back to character
                freq1 = freq[i];       // Update max frequency
            }
        }

        return ch;
    }

}
