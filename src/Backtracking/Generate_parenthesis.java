package Backtracking;

import java.util.ArrayList;
import java.util.List;

public class Generate_parenthesis {
    public List<String> generateParenthesis(int n) {
        List<String> st = new ArrayList<>();
        return solve(0, 0, "", st, n); // start recursion with 0 open and close brackets
    }

    List<String> solve(int open, int close, String s, List<String> res, int n) {
        // if we have used all parentheses, add the valid string
        if (open == close && open + close == 2 * n) {
            res.add(s);
        }

        // add an opening bracket if possible
        if (open < n) {
            solve(open + 1, close, s + "(", res, n);
        }

        // add a closing bracket if it won't break validity
        if (close < open) {
            solve(open, close + 1, s + ")", res, n);
        }

        return res;
    }
}
