package HashMap;

import java.util.HashMap;
import java.util.Map;

public class Contiguoes_array {
    public int findMaxLength(int[] nums) {
        return maxlength(nums);
    }

    int maxlength(int[] arr) {
        int n = arr.length;
        if (n == 1) {
            return 0;
        }

        int ans = 0;
        Map<Integer, Integer> mp = new HashMap<>();
        mp.put(0, -1); // Base case: sum 0 at index -1

        int currSum = 0;

        for (int i = 0; i < n; i++) {
            // Treat 0 as -1 to use prefix sum technique
            if (arr[i] == 0) {
                currSum--;
            } else {
                currSum++;
            }

            // If this sum has been seen before, a subarray with equal 0s and 1s exists
            if (mp.containsKey(currSum)) {
                ans = Math.max(ans, i - mp.get(currSum)); // Update max length
            } else {
                mp.put(currSum, i); // Store first occurrence of the sum
            }
        }

        return ans; // Return length of longest subarray with equal 0s and 1s
    }

}
