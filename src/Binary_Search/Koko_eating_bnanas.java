package Binary_Search;

import java.util.Arrays;

public class Koko_eating_bnanas {
    public int minEatingSpeed(int[] piles, int h) {
        // Find the minimum eating speed to finish all bananas in h hours
        return minSpeed(piles, h);
    }

    int minSpeed(int[] arr, int h) {
        int n = arr.length;

        int l = 1;  // Minimum possible speed
        int r = Arrays.stream(arr).max().getAsInt(); // Maximum speed = max pile size

        // Binary search for the minimum valid speed
        while (l < r) {
            int m = l + (r - l) / 2;

            if (canEatAll(arr, m, h)) {
                // Can finish with speed m, try smaller speed
                r = m;
            } else {
                // Too slow, need higher speed
                l = m + 1;
            }
        }

        // l is the minimum speed at which Koko can finish all bananas in h hours
        return l;
    }

    // Check if Koko can eat all bananas at speed m within h hours
    boolean canEatAll(int[] arr, int m, int h) {
        int actualTime = 0;

        for (int ele : arr) {
            // Time to eat each pile at speed m (ceil division)
            actualTime += ele / m;
            if (ele % m != 0) actualTime++;
        }

        return actualTime <= h;
    }
}
