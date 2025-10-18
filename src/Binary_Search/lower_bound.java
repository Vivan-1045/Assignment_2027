package Binary_Search;

public class lower_bound {
    int lowerBound(int[] arr, int target) {
        // Returns the index of the first element in arr which is >= target
        return lB(arr, target);
    }

    int lB(int[] arr, int tar) {
        int s = 0;              // Start of search range
        int e = arr.length;     // End  allows inserting at the end if needed

        while (s < e) {
            int m = s + (e - s) / 2;  // Midpoint to prevent overflow

            if (arr[m] >= tar) {
                // Current element is >= target, possible answer — search left half
                e = m;
            } else {
                // Current element is < target — discard left half including mid
                s = m + 1;
            }
        }

        // At this point, 'e' is the index of the lower bound
        return e;
    }
}
