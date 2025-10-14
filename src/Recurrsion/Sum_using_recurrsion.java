package Recurrsion;

public class Sum_using_recurrsion {
    int arraySum(int arr[]) {
        // Start the recursive sum from index 0
        return sum(arr, 0);
    }

    int sum(int[] arr, int idx) {
        // Base case: if we've gone past the end of the array, return 0
        if (idx >= arr.length) {
            return 0;
        }

        // Add the current element to the sum of the rest of the array
        int sum = arr[idx] + sum(arr, idx + 1);
        return sum;
    }

}
