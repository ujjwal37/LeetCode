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
    public List<String> binaryTreePaths(TreeNode root){
        
        List<String> list = new ArrayList<String>();
        if( root != null)
            paths(root,"",list);
        
        return list;        
    }
    public void paths(TreeNode root, String answer, List<String> list){
        
        if(root.left == null && root.right == null)
            list.add(answer + root.val);
        
        if(root.left != null)
            paths(root.left , answer + root.val +"->", list);
        
        if(root.right != null)
            paths(root.right , answer + root.val + "->", list);
    }        
    }
