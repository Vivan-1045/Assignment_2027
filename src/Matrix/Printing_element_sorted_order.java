package Matrix;

public class Printing_element_sorted_order {
    public int[] sortArray(int[] nums) {
        // Start sorting the whole array from index 0 to last index
        sortArr(nums, 0, nums.length - 1);
        return nums;
    }

    void sortArr(int[] arr, int l, int r) {
        // If there is more than one element
        if (l < r) {
            // Find the middle point to split the array
            int m = l + (r - l) / 2;
            // Sort the left half
            sortArr(arr, l, m);
            // Sort the right half
            sortArr(arr, m + 1, r);
            // Merge the two sorted halves
            mergeArr(arr, l, m, r);
        }
    }

    void mergeArr(int[] arr, int l, int m, int r) {
        // Sizes of two subarrays to merge
        int n1 = m - l + 1;
        int n2 = r - m;

        // Temporary arrays to hold the left and right halves
        int[] L = new int[n1];
        int[] R = new int[n2];

        // Copy data to temporary arrays
        for (int i = 0; i < n1; i++) {
            L[i] = arr[l + i];
        }
        for (int j = 0; j < n2; j++) {
            R[j] = arr[m + 1 + j];
        }

        // Merge temporary arrays back into original array
        int i = 0, j = 0, k = l;
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                arr[k++] = L[i++];
            } else {
                arr[k++] = R[j++];
            }
        }

        // Copy remaining elements of left half
        while (i < n1) {
            arr[k++] = L[i++];
        }

        // Copy remaining elements of right half
        while (j < n2) {
            arr[k++] = R[j++];
        }
    }

}
