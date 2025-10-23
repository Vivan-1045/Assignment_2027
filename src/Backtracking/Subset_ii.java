package Backtracking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Subset_ii {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        return UniqueSubset(nums); // generate all unique subsets
    }

    List<List<Integer>> UniqueSubset(int[] arr) {
        // sort to group duplicates together
        Arrays.sort(arr);

        List<List<Integer>> outer = new ArrayList<>();
        outer.add(new ArrayList<>()); // start with empty subset

        int e = 0; // end pointer for last added subsets

        for (int i = 0; i < arr.length; i++) {
            int s = 0; // start pointer

            // if current element is duplicate, only extend subsets
            // added in the previous step
            if (i > 0 && arr[i] == arr[i - 1]) {
                s = e + 1;
            }

            e = outer.size() - 1; // mark end of current list before adding new subsets
            int n = outer.size();

            // create new subsets by adding current element
            for (int j = s; j < n; j++) {
                List<Integer> internal = new ArrayList<>(outer.get(j));
                internal.add(arr[i]);
                outer.add(internal);
            }
        }

        return outer; // return list of all unique subsets
    }
}
