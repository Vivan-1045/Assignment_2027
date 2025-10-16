package Advance_Array;

public class Sort_0_1_2 {
    public void sortColors(int[] nums) {
        int l = 0, m = 0, h = nums.length - 1;

        // Process elements from left to right
        while (m <= h) {
            if (nums[m] == 0) {
                swap(nums, l++, m++); // Move 0 to the front
            } else if (nums[m] == 1) {
                m++; // Leave 1 in the middle
            } else {
                swap(nums, m, h--); // Move 2 to the end
            }
        }
    }

    // Swap helper
    void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
