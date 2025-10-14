package Recurrsion;

public class Power_of_number {
    public int reverseExponentiation(int n) {
        // Convert the number to a string
        String s = "" + n;
        String s1 = "";

        // Reverse the string
        for (int i = s.length() - 1; i >= 0; i--) {
            s1 += s.charAt(i);
        }

        // Convert the reversed string back to a number
        // and return n raised to the power of that number
        return (int)Math.pow(n, Integer.parseInt(s1));
    }

}
