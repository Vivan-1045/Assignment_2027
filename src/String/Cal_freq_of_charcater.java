package String;

import java.util.HashMap;
import java.util.Map;

public class Cal_freq_of_charcater {
    int getCount(String S, int N) {
        // Map to store how many times each character appears
        Map<Character, Integer> mp = new HashMap<>();

        // Loop through the string
        for (int i = 0; i < S.length(); i++) {
            // If current and next character are different, count the current one
            if (i + 1 < S.length() && S.charAt(i) != S.charAt(i + 1)) {
                mp.put(S.charAt(i), mp.getOrDefault(S.charAt(i), 0) + 1);
            }
        }

        // Always count the last character
        mp.put(S.charAt(S.length() - 1), mp.getOrDefault(S.charAt(S.length() - 1), 0) + 1);

        int cnt = 0;

        // Count how many characters appeared exactly N times
        for (int val : mp.values()) {
            if (val == N) {
                cnt++;
            }
        }

        return cnt;
    }

}
