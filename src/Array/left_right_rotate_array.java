package Array;

public class left_right_rotate_array {
    public void rotate(int[] nums, int k) {
        rotatedArray1(nums,k);
    }
    int[] rotatedArray1(int[] arr, int k) {
        int n = arr.length;
        if (k == 0) {
            return arr; // No rotation needed
        }
        k %= n; // Handle cases where k > n

        // Reverse entire array
        reverse(arr, 0, n - 1);

        // Reverse first k elements
        reverse(arr, 0, k - 1);

        // Reverse remaining n - k elements
        reverse(arr, k, n - 1);

        return arr; // Return rotated array
    }

    public static void reverse(int[] arr, int s, int e) {
        // Reverse elements between indices s and e
        while (s < e) {
            int ele = arr[e];
            arr[e] = arr[s];
            arr[s] = ele;
            s++;
            e--;
        }
    }
}
