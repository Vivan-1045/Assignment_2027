package Priority_Queue;

import java.util.ArrayDeque;

public class Slidnig_window_maximum {
    public int[] maxSlidingWindow(int[] nums, int k) {
        // Deque to store potential max elements in the current window
        ArrayDeque<Integer> q = new ArrayDeque<>();

        int i = 0, j = 0, ptr = 0;
        int n = nums.length;

        // Result array to store max of each window
        int[] res = new int[n - k + 1];

        while (j < n) {
            // Maintain elements in deque in decreasing order
            // Remove elements smaller than current from the back
            while (!q.isEmpty() && q.peekLast() < nums[j]) {
                q.pollLast();
            }

            // Add current element to the deque
            q.add(nums[j]);

            // Expand window until it reaches size k
            if (j - i + 1 < k) {
                j++;
            }
            // When window size is exactly k
            else if (j - i + 1 == k) {
                // Front of deque is the maximum in the current window
                res[ptr++] = q.peek();

                // Remove the element going out of the window if it's the max
                if (nums[i] == q.peek()) {
                    q.pollFirst();
                }

                // Slide the window forward
                i++;
                j++;
            }
        }

        return res;
    }

}
