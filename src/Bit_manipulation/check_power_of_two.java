package Bit_manipulation;

public class check_power_of_two {
    public boolean isPowerOfTwo(int n) {
        // A number n is a power of two if it is positive
        // and has exactly one bit set in its binary form.
        // (n & (n - 1)) == 0 checks that only one bit is set.
        return ((n & (n - 1)) == 0 && n > 0) ? true : false;
    }
}
