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
    private List<Integer> list;
    public List<Integer> preorderTraversal(TreeNode root) {
        if(root == null){
            return new ArrayList<Integer>();
        }

        list = new ArrayList<Integer>();

        preOrder(root);

        return list;
        
    }

    private void preOrder(TreeNode root){
        if(root == null){
            return;
        }

        list.add(root.val);
        preOrder(root.left);
        preOrder(root.right);
    }
}