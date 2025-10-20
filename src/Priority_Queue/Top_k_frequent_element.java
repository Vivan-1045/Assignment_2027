package Priority_Queue;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class Top_k_frequent_element {
    public int[] topKFrequent(int[] nums, int k) {
        // Delegate to helper method to find k most frequent elements
        return mostFrequent(nums, k);
    }

    int[] mostFrequent(int[] arr, int k) {
        int[] ans = new int[k];

        // Count the frequency of each element
        Map<Integer, Integer> mp = new HashMap<>();
        for (int j : arr) {
            mp.put(j, mp.getOrDefault(j, 0) + 1);
        }

        // Create a max heap based on frequency
        PriorityQueue<Map.Entry<Integer, Integer>> pq =
                new PriorityQueue<>((a, b) -> b.getValue() - a.getValue());

        // Add all entries from the frequency map into the heap
        pq.addAll(mp.entrySet());

        // Extract the top k elements with highest frequency
        int i = 0;
        while (i < k && !pq.isEmpty()) {
            ans[i] = pq.poll().getKey();
            i++;
        }

        return ans;
    }
}
