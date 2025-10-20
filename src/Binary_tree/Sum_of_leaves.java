package Binary_tree;

public class Sum_of_leaves {

    class TreeNode{
        int val;
        TreeNode left,right;

        TreeNode(int val,TreeNode l, TreeNode r){
            this.val=val;
            this.left = l;
            this.right = r;
        }
    }

    public int sumOfLeftLeaves(TreeNode root) {
        // Start recursive traversal to calculate the sum
        sumOfLeav(root);
        return ans;
    }

    // Variable to store the sum of all left leaves
    int ans = 0;

    void sumOfLeav(TreeNode root) {
        // Base case: if the current node is null, return
        if (root == null) {
            return;
        }

        // Check if the left child exists and is a leaf node
        if (root.left != null) {
            if (root.left.left == null && root.left.right == null) {
                // Add the value of the left leaf to the sum
                ans += root.left.val;
            }
        }

        // Recursively check the left subtree
        if (root.left != null) {
            sumOfLeav(root.left);
        }

        // Recursively check the right subtree
        if (root.right != null) {
            sumOfLeav(root.right);
        }
    }

}
