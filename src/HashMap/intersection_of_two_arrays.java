package HashMap;

import java.util.HashSet;

public class intersection_of_two_arrays {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> hs1 = new HashSet<>();
        // Add all elements of nums1 to the first HashSet
        for (int i = 0; i < nums1.length; i++) {
            hs1.add(nums1[i]);
        }

        HashSet<Integer> hs2 = new HashSet<>();
        // For each element in nums2, check if it exists in hs1
        // If yes, add to hs2 to store the intersection without duplicates
        for (int i = 0; i < nums2.length; i++) {
            if (hs1.contains(nums2[i])) hs2.add(nums2[i]);
        }

        // Convert the HashSet hs2 to an int array for the result
        int[] result = new int[hs2.size()];
        int idx = 0;
        for (var a : hs2) {
            result[idx++] = a;
        }

        return result;  // Return array containing unique intersection elements
    }

}
