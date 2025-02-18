import javax.swing.tree.TreeNode;

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */


 // Using brute force
class Solution {
    public boolean isBalanced(TreeNode root) {
        if(root == null) return true;

        int leftHeight = height(root.left);
        int rightHeight = height(root.right);
        if(Math.abs(leftHeight - rightHeight) > 1){
            return false;
        }
        return isBalanced(root.left) && isBalanced(root.right);
    }
    public int height(TreeNode root){
        if(root == null) return 0;
        return 1 + Math.max(height(root.left), height(root.right));
    }
}

 // Using DFS
 class Solution2 {
    public boolean isBalanced(TreeNode root) {
        return dfs(root)[0] == 1;
    }
    private int[] dfs(TreeNode root){
        if(root == null){
            return new int[]{1, 0};

        }
        int[] left = dfs(root.left);
        int[] right = dfs(root.right);
        boolean balanced = (left[0] == 1 && right[0] == 1) && (Math.abs(left[1] - right[1]) < = 1);
        int height = 1 + Math.max(left[1], right[1]);
        return new int[]{balanced ? 1 : 0, height};
    }
}