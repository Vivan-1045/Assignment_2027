package Greedy;

import java.util.Arrays;

public class Minimum_platform {
    public int minPlatform(int arr[], int dep[]) {
        // calculate minimum number of platforms needed
        return minPlat(arr, dep);
    }

    static int minPlat(int[] arr, int[] dep) {
        // sort arrival and departure times
        Arrays.sort(arr);
        Arrays.sort(dep);

        int res = 1;        // result: max platforms needed
        int currPlat = 1;   // current platforms occupied
        int i = 1;          // pointer for arrivals
        int j = 0;          // pointer for departures
        int n = arr.length;

        // iterate over arrivals and departures
        while (i < n && j < n) {
            if (arr[i] <= dep[j]) {
                // train arrives before earliest departure → need more platform
                currPlat++;
                i++;
            } else {
                // train departs → free platform
                currPlat--;
                j++;
            }
            // update max platforms needed so far
            res = Math.max(res, currPlat);
        }

        return res;
    }

}
