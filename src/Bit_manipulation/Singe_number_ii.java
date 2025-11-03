package Bit_manipulation;

public class Singe_number_ii {
    int unique(int[] arr) {
        int ans = 0;
        // Check each bit position (0 to 31 for 32-bit integers)
        for (int i = 0; i <= 31; i++) {
            int oneCount = 0;
            // Count how many numbers have the i-th bit set
            for (int num : arr) {
                if ((num & (1 << i)) != 0) {
                    oneCount++;
                }
            }
            // If the count of set bits is not a multiple of 3,
            // that bit belongs to the unique (non-repeated) number
            if (oneCount % 3 == 1) {
                ans = ans | (1 << i);
            }
        }
        return ans;
    }

}
