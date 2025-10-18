package HashMap;

import java.util.HashMap;
import java.util.Map;

public class Two_sum {
    public int[] twoSum(int[] nums, int target) {
        // Map to store number and its index
        Map<Integer, Integer> map = new HashMap<>();

        // Traverse the array once
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];

            // Check if complement already exists in map
            if (map.containsKey(complement)) {
                return new int[]{map.get(complement), i}; // Return indices of the pair
            }

            // Store current number with its index
            map.put(nums[i], i);
        }

        return new int[]{}; // No valid pair found
    }
}
