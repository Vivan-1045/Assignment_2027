package Priority_Queue;

import java.util.Collections;
import java.util.PriorityQueue;

public class kth_largest_element {
    public int findKthLargest(int[] nums, int k) {
        // Delegate to helper method to find the kth largest element
        return findElement(nums, k);
    }

    int findElement(int[] arr, int k) {
        // Max heap to store elements in descending order
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

        // Add all elements to the max heap
        for (int ele : arr) {
            pq.offer(ele);
        }

        int ans = -1;
        // Remove the top element k times to get the kth largest
        while (k-- > 0) {
            ans = pq.poll();
        }

        return ans;
    }
}
