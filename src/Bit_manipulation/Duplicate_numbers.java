package Bit_manipulation;

public class Duplicate_numbers {
    public int findDuplicate(int[] nums) {
        // Finds and returns the duplicate number using cyclic sort logic
        int ans = duplex(nums);
        return ans;
    }

    int duplex(int[] arr) {
        int i = 0;
        // Place each number at its correct index (value - 1)
        // If a duplicate is found during placement, return it
        while (i < arr.length) {
            if (arr[i] != i + 1) {
                int cridx = arr[i] - 1;
                if (arr[i] != arr[cridx]) {
                    swap(arr, i, cridx); // Swap to place number correctly
                } else {
                    return arr[i]; // Duplicate found
                }
            } else {
                i++; // Move to next index if already in correct place
            }
        }
        return -1; // Should not reach here if duplicate exists
    }

    void swap(int[] arr, int first, int second) {
        // Standard element swap
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

}
