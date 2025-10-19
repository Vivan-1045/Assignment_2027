package Priority_Queue;

import java.util.Collections;
import java.util.PriorityQueue;

public class Implement_pq {
    // Function to insert element into the queue
    static void insert(PriorityQueue<Integer> q, int k) {
        // Insert k into the priority queue
        q.offer(k);
    }

    // Function to find an element k
    static boolean find(PriorityQueue<Integer> q, int k) {
        // Check if the priority queue contains k
        return q.contains(k);
    }

    // Function to delete the max element from queue
    static int delete(PriorityQueue<Integer> q) {
        // PriorityQueue in Java is a min-heap by default
        // To delete the max, we need to find it manually
        if (q.isEmpty()) return -1;

        int max = Collections.max(q); // Find the max element
        q.remove(max); // Remove the first occurrence of the max element
        return max;
    }
}
