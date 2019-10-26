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
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        if(inorder.length != postorder.length)
            return null;    
        return helper(postorder.length-1,0,inorder.length-1,inorder,postorder);
    }
    
    
    public TreeNode helper(int pre , int instart , int end,int[] inorder , int[] preorder){
        
        if(instart > end)
            return null;
        
        TreeNode root = new TreeNode(preorder[pre]);
        
        
        int finder = 0;
        for(int i =0 ; i < inorder.length; i++){
            if(inorder[i] == preorder[pre]){
                finder = i;
            }
        }
            
         root.right = helper(pre -1 ,finder+1, end, inorder, preorder );
         root.left  = helper(pre-1 +finder-end , instart, finder-1,inorder, preorder);
        
        
        
        return root;
            
            
        }        
    }