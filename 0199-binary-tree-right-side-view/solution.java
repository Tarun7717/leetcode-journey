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
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> res=new ArrayList<>();
        Queue<TreeNode> q=new LinkedList<>();
        if(root==null)
        {
            return res;
        }
        q.add(root);
        TreeNode p=null;
        while(!q.isEmpty())
        {
            int n=q.size();
            for(int i=0;i<n;i++)
            {
                p=q.poll();
                if(p.left!=null)
                {
                    q.add(p.left);
                }  
                if(p.right!=null)
                {
                    q.add(p.right);
                }
            }
            res.add(p.val);
        }
        return res;
    }
}
