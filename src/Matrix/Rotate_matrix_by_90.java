package Matrix;

public class Rotate_matrix_by_90 {
    class Solution {
        public void rotate(int[][] matrix) {
            rotateImage(matrix);
        }

        int[][] rotateImage(int[][] arr) {
            int n = arr.length;

            // Step 1: Transpose the matrix (swap rows and columns)
            for (int i = 0; i < n; i++) {
                for (int j = i; j < n; j++) {
                    int temp = arr[i][j];
                    arr[i][j] = arr[j][i];
                    arr[j][i] = temp;
                }
            }

            // Step 2: Reverse each row to get the rotated matrix
            for (int[] row : arr) {
                reverse(row);
            }

            return arr;
        }

        // Helper function to reverse elements in an array
        void reverse(int[] arr) {
            int e = arr.length - 1;
            for (int i = 0; i < arr.length; i++) {
                if (e > i) {
                    int temp = arr[e];
                    arr[e] = arr[i];
                    arr[i] = temp;
                    e--;
                }
            }
        }
    }

}
