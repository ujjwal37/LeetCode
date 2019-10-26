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
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        ArrayList<Integer> l1 = new ArrayList<Integer>();
        ArrayList<Integer> l2 = new ArrayList<Integer>();
        Dfs(root1 , l1);
        Dfs(root2 , l2);
    
        
        return l1.equals(l2);
    }
    public void Dfs(TreeNode root , List<Integer> leafValues){
        if(root != null){
        if(root.left == null && root.right == null)
            leafValues.add(root.val);
        
        Dfs(root.left , leafValues);
        Dfs(root.right , leafValues);
    }
}
}
