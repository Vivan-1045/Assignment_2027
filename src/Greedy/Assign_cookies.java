package Greedy;

import java.util.Arrays;

public class Assign_cookies {
    public int findContentChildren(int[] g, int[] s) {
        // sort greed factors and cookie sizes
        Arrays.sort(g);
        Arrays.sort(s);

        int content = 0; // count of content children
        int i = 0; // pointer for children
        int j = 0; // pointer for cookies

        // assign cookies to children greedily
        while (i < g.length && j < s.length) {
            // if cookie can satisfy the child
            if (s[j] >= g[i]) {
                content++; // child is content
                i++;       // move to next child
            }
            j++; // move to next cookie
        }

        return content; // total number of content children
    }
}
