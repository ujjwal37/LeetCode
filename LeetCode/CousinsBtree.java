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
    HashMap<Integer, Integer> depth;
    HashMap<Integer , TreeNode> parent;
    public boolean isCousins(TreeNode root, int x, int y) {
        depth = new HashMap();
        parent = new HashMap();
        dfs(root, null);
        
        return(depth.get(x) == depth.get(y) && parent.get(x) != parent.get(y));
        
    }
    
    public void dfs(TreeNode node, TreeNode par){
        if( node != null){
            depth.put(node.val , par != null ? 1+depth.get(par.val) : 0);
            parent.put(node.val , par);
            dfs(node.left , node);
            dfs(node.right , node);
            
            
        }
    }
}