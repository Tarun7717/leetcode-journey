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
    public List<List<Integer>> levelOrder(TreeNode root) {
       List<List<Integer>> result= new ArrayList<>();
       Queue<TreeNode> q=new LinkedList<>();
       if(root==null)
       {
            return result;
       }
        q.add(root);
       while(!q.isEmpty())
       {
            List<Integer> level=new ArrayList<>();
            int n=q.size();
            for(int i=0;i<n;i++)
            {
                TreeNode p=q.poll();
                if(p.left!=null)
                {
                    q.add(p.left);
                }
                if(p.right!=null)
                {
                    q.add(p.right);
                }
                level.add(p.val);
            }
            result.add(level);
       }
       return result;
    }
}
