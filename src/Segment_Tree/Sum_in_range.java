package Segment_Tree;

public class Sum_in_range {
    int[] tree;
    int n;
    class NumArray {


        public void buildTree(int idx, int l, int r, int[] arr) {

            // Base case: leaf node
            if (l == r) {
                tree[idx] = arr[l];
                return;
            }
            int m = l + (r - l) / 2;
            // Build left and right subtrees
            buildTree(2 * idx + 1, l, m, arr);
            buildTree(2 * idx + 2, m + 1, r, arr);
            // Store sum of left and right children
            tree[idx] = tree[2 * idx + 1] + tree[2 * idx + 2];
        }

        public NumArray(int[] nums) {
            n = nums.length;
            tree = new int[4 * n]; // Allocate enough space for segment tree
            buildTree(0, 0, n - 1, nums);
        }

        public void update(int index, int val) {
            updateTree(index, val, 0, 0, n - 1);
        }

        void updateTree(int idx, int val, int i, int l, int r) {
            // Base case: leaf node update
            if (l == r) {
                tree[i] = val;
                return;
            }
            int m = l + (r - l) / 2;
            // Update in the appropriate child
            if (idx <= m) {
                updateTree(idx, val, 2 * i + 1, l, m);
            } else {
                updateTree(idx, val, 2 * i + 2, m + 1, r);
            }
            // Recalculate parent sum
            tree[i] = tree[2 * i + 1] + tree[2 * i + 2];
        }

        public int sumRange(int s, int e) {
            return query(s, e, 0, 0, n - 1);
        }

        int query(int s, int e, int i, int l, int r) {
            // No overlap
            if (r < s || e < l) return 0;
            // Total overlap
            if (l >= s && r <= e) return tree[i];
            // Partial overlap
            int m = l + (r - l) / 2;
            return query(s, e, 2 * i + 1, l, m) + query(s, e, 2 * i + 2, m + 1, r);
        }
    }

}
