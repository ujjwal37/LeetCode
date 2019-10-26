/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public TreeNode mergeTrees(TreeNode t1, TreeNode t2) {
              if(t1 == null && t2 == null)
                return null;
        
        TreeNode root = new TreeNode(0);
        if(t1 != null &&  t2 != null)
            root.val = t1.val+t2.val;
        
        if(t1 == null || t2 == null){
            if(t1 == null) root.val = t2.val;
            if(t2 == null) root.val = t1.val;
        }
        
  
        root.right = mergeTrees(t1 != null ? t1.right : null , t2 != null ? t2.right: null);
        root.left = mergeTrees(t1 != null ? t1.left : null , t2 != null ? t2.left : null);
        
        return root;
    }
}