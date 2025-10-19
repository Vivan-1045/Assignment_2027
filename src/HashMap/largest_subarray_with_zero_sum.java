package HashMap;

import java.util.HashMap;
import java.util.Map;

public class largest_subarray_with_zero_sum {
    int maxLength(int arr[]) {
        return maxL(arr);
    }

    int maxL(int[] arr) {
        int ans = 0;
        int sum = 0;
        Map<Integer, Integer> mp = new HashMap<>(); // Stores first occurrence of each prefix sum

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i]; // Update running prefix sum

            if (sum == 0) {
                ans = Math.max(ans, i + 1); // Subarray from start has zero sum
            }

            if (mp.containsKey(sum)) {
                // If same sum seen before, subarray between indices has zero sum
                ans = Math.max(ans, i - mp.get(sum));
            } else {
                mp.put(sum, i); // Store first occurrence of this sum
            }
        }

        return ans; // Return length of longest subarray with zero sum
    }

}
