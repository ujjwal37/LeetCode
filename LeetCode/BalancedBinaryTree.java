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
    
    private boolean result = true;
    
    public int checkLenght(TreeNode root){
        
        if(root == null)
            return 0;
       
            int left = checkLenght(root.left);
            int right = checkLenght(root.right);

        
        if(Math.abs(right - left) > 1)
        result = false;
        
        return 1+Math.max(left,right);
        
        
        
    }
    public boolean isBalanced(TreeNode root) {
        
        int n = checkLenght(root);
        return result;
    
    }
}