package Advance_Array;

public class Two_sum {

        public int[] twoSum(int[] nums, int target) {
            int n = nums.length;

            // Check all pairs
            for (int i = 0; i < n; i++) {
                for (int j = i + 1; j < n; j++) {
                    if (target == nums[i] + nums[j]) {
                        return new int[]{i, j}; // Return indices if sum matches target
                    }
                }
            }

            return new int[]{}; // No pair found
        }


}
