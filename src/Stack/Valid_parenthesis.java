package Stack;

import java.util.Stack;

public class Valid_parenthesis {
    public boolean isValid(String s) {
        return valid(s); // Delegate to helper method
    }

    boolean valid(String s) {
        Stack<Character> st = new Stack<>();

        for (char ch : s.toCharArray()) {
            if (ch == '(' || ch == '{' || ch == '[') {
                st.push(ch); // Push opening brackets
            } else {
                // Check for matching opening bracket
                if (ch == ')') {
                    if (st.isEmpty() || st.pop() != '(') return false;
                }
                if (ch == '}') {
                    if (st.isEmpty() || st.pop() != '{') return false;
                }
                if (ch == ']') {
                    if (st.isEmpty() || st.pop() != '[') return false;
                }
            }
        }

        return st.isEmpty(); // True if all brackets matched
    }

}
