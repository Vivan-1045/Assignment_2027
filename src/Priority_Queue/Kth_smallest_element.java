package Priority_Queue;

import java.util.PriorityQueue;

public class Kth_smallest_element {
    public int kthSmallest(int[] arr, int k) {
        // Delegate to helper method to find the kth smallest element
        return findElement(arr, k);
    }

    int findElement(int[] arr, int k) {
        // Min heap to store elements in ascending order (default behavior)
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        // Add all elements to the min heap
        for (int ele : arr) {
            pq.offer(ele);
        }

        int ans = -1;
        // Remove the smallest element k times to get the kth smallest
        while (k-- > 0) {
            ans = pq.poll();
        }

        return ans;
    }

}
