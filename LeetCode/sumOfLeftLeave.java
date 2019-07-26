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
        
        public int helper(TreeNode root, boolean left){
            
            if( root == null)
                return 0;
            
         if(root.left == null &&  root.right == null && left)
             return root.val;
            
            
    
       return helper(root.left,true)+ helper(root.right, false);
            
        }
    public int sumOfLeftLeaves(TreeNode root) {
        return helper(root,false);
    }
}
