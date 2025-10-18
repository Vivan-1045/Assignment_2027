package Binary_tree;

public class Valid_bst {
        class TreeNode{
            int val;
            TreeNode left,right;
            TreeNode(int val,TreeNode l,TreeNode r){
                this.val=val;
                this.left=l;
                this.right=r;
            }
        }

        public boolean isValidBST(TreeNode root) {
            // Start recursion with the full valid range of values
            return helper(root, Long.MIN_VALUE, Long.MAX_VALUE);
        }

        boolean helper(TreeNode root, long min, long max) {
            if (root == null) {
                return true;  // An empty tree is a valid BST
            }

            // Current node must be strictly between min and max
            if (root.val <= min || root.val >= max) {
                return false;  // Violates BST property
            }

            // Left subtree: max allowed value is current node's value
            // Right subtree: min allowed value is current node's value
            return helper(root.left, min, root.val) && helper(root.right, root.val, max);
        }


}
