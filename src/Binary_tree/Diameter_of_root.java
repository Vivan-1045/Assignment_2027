package Binary_tree;

import javax.swing.tree.TreeNode;

public class Diameter_of_root {
    class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int val ,TreeNode l, TreeNode r){
            this.val = val;
            this.left=l;
            this.right=r;
        }
    }
    int diameter = 0;  // Stores the maximum diameter in terms of number of nodes

    public int diameterOfBinaryTree(TreeNode root) {
        height(root);  // Start DFS traversal to calculate height and update diameter
        return diameter - 1;  // Diameter in terms of edges = nodes - 1
    }

    int height(TreeNode root) {
        if (root == null) return 0;  // Base case: null node has height 0

        int leftH = height(root.left);   // Height of left subtree
        int rightH = height(root.right); // Height of right subtree

        // Update diameter: longest path through current node (as number of nodes)
        diameter = Math.max(diameter, leftH + rightH + 1);

        // Height of current node = max height of subtrees + 1 (current node)
        return Math.max(leftH, rightH) + 1;
    }
}
