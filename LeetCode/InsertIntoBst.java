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
    public TreeNode insertIntoBST(TreeNode root, int val) {
        
        TreeNode node = new TreeNode(val);
        
        if(root.val < val){
             if(root.right == null)
                root.right = node;
            insertIntoBST(root.right,val);
        }else if(root.val > val){
              if(root.left == null)
                root.left = node;
             insertIntoBST(root.left,val);

        }
        return root;
    }
}