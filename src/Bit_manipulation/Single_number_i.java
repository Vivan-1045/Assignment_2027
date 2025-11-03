package Bit_manipulation;

public class Single_number_i {
    class Solution {
        public int singleNumber(int[] nums) {
            // Returns the element that appears only once
            // by calling the helper method 'unique'
            return unique(nums);
        }

        int unique(int[] arr) {
            int a = 0;
            // XOR all elements: duplicates cancel out,
            // leaving the number that appears only once
            for (int a1 : arr) {
                a ^= a1;
            }
            return a;
        }
    }

}
