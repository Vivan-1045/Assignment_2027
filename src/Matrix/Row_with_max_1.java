package Matrix;

public class Row_with_max_1 {
    public int[] rowAndMaximumOnes(int[][] mat) {
        return rowAndMaxOne(mat);
    }

    int[] rowAndMaxOne(int[][] mat) {
        int maxOne = 0;

        // Find the maximum number of 1s in any row
        for (int[] arr : mat) {
            int cnt = 0;
            for (int ele : arr) {
                if (ele == 1) {
                    cnt++;
                }
            }
            maxOne = Math.max(maxOne, cnt);
        }

        int i = 0;
        // Find the first row that has this maximum number of 1s
        for (int[] arr : mat) {
            int cnt = 0;
            for (int ele : arr) {
                if (ele == 1) {
                    cnt++;
                }
            }
            if (cnt == maxOne) {
                // Return the row index and count of 1s
                return new int[]{i, cnt};
            }
            i++;
        }

        // If no row found (unlikely), return [-1, -1]
        return new int[]{-1, -1};
    }

}
