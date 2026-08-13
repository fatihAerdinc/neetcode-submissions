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
class Solution {
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if(root == null) return false;

        return dfs(root, 0, targetSum);
    }

    private boolean dfs(TreeNode root, int curr, int target){
        if(root == null){
            return false;
        }
        int val = curr + root.val;
        if(root.right == null && root.left == null){
            if(target == val){
                return true;
            }
            return false;
        }

        return dfs(root.right, root.val + curr, target) || 
               dfs(root.left, root.val + curr, target);
    }
}