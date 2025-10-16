package Advance_Array;

import java.util.Arrays;

public class Merge_sorted_array {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        // Copy all elements from nums2 into the end of nums1
        for (int i = m, j = 0; i < m + n; i++, j++) {
            nums1[i] = nums2[j];
        }

        // Sort the entire nums1 array
        Arrays.sort(nums1);
    }
}
