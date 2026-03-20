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
    public int minDepth(TreeNode root) {
        Queue<TreeNode> q=new LinkedList<>();
        if(root==null)
        {
            return 0;
        }
        int count=1;
        q.add(root);
        while(!q.isEmpty())
        {
            int n=q.size();
            for(int i=0;i<n;i++)
            {
                TreeNode p=q.poll();
                if(p.left==null && p.right==null)
                {
                    return count;
                }
                if(p.left!=null)
                {
                    q.add(p.left);
                }
                if(p.right!=null)
                {
                    q.add(p.right);
                }
            }
           count++;
        }
        return count;
    }
}
