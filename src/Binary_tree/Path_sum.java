package Binary_tree;

public class Path_sum {

        class TreeNode{
            int val;
            TreeNode left;
            TreeNode right;

            TreeNode(int val,TreeNode l,TreeNode r){
                this.val = val;
                this.left = l;
                this.right = r;
            }
        }

        public boolean hasPathSum(TreeNode root, int targetSum) {
            return pathSum(root, targetSum);  // Start recursive check for path sum
        }

        boolean pathSum(TreeNode root, int reqSum) {
            if (root == null) {
                return false;  // No node means no path
            }

            // Check if it's a leaf node and path sum equals required sum
            if (reqSum == root.val && root.left == null && root.right == null) {
                return true;
            }

            // Recursively check left and right subtrees with updated required sum
            return pathSum(root.left, reqSum - root.val) || pathSum(root.right, reqSum - root.val);
        }


}
