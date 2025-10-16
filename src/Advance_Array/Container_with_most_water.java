package Advance_Array;

public class Container_with_most_water {
    public int maxArea(int[] height) {
        return maxAreaCoverd(height);
    }

    int maxAreaCoverd(int[] arr) {
        int n = arr.length;
        int ans = Integer.MIN_VALUE;
        int i = 0;
        int j = n - 1;

        // Two-pointer approach
        while (i < j) {
            // Calculate area between the two lines
            int area = (j - i) * Math.min(arr[i], arr[j]);
            ans = Math.max(ans, area);

            // Move the shorter line inward to try for a bigger area
            if (arr[i] > arr[j]) {
                j--;
            } else {
                i++;
            }
        }

        return ans;
    }

}
