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
    TreeNode prev=null;
    TreeNode curr = null;
    public boolean isValidBST(TreeNode root) {
        return inorder(root);
    }

    private boolean inorder(TreeNode node){
        if(node==null){
            return true;
        }
        if(!inorder(node.left)){
            return false;
        }

        // root node
        if(prev!=null && node.val<=prev.val){
            return false;
        }
        prev=node;

        // right subtree
        return inorder(node.right);

    }
}
