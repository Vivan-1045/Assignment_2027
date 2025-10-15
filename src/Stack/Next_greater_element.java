package Stack;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class Next_greater_element {
    int[] Ans(int[] A, int[] B) {
        Map<Integer, Integer> mp = new HashMap<>();
        Stack<Integer> stk = new Stack<>();
        int[] ans = new int[A.length];

        // Build map of next greater elements for B using a stack
        for (int i = 0; i < B.length; i++) {
            while (!stk.isEmpty() && stk.peek() < B[i]) {
                mp.put(stk.pop(), B[i]);
            }
            stk.push(B[i]);
        }

        // Elements left in stack have no next greater element
        for (int i : stk) {
            mp.put(i, -1);
        }

        // Fill result for A based on the map
        for (int i = 0; i < A.length; i++) {
            ans[i] = mp.get(A[i]);
        }

        return ans;
    }

}
