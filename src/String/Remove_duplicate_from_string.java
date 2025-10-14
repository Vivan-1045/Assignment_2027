package String;

import java.util.HashSet;
import java.util.Set;

public class Remove_duplicate_from_string {

    String removeDuplicates(String s) {
        // Set to keep track of characters we've already seen
        Set<Character> st = new HashSet<>();

        // String to build the result without duplicates
        String s1 = "";

        // Go through each character in the input string
        for (char c : s.toCharArray()) {
            // If we've already seen the character, skip it
            if (st.contains(c)) {
                continue;
            } else {
                // If it's new, add it to the result and mark it as seen
                s1 += c;
                st.add(c);
            }
        }

        return s1;
    }

}
