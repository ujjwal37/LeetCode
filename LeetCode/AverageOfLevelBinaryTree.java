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
    public List<Double> averageOfLevels(TreeNode root) {
        ArrayList<Double> list  = new ArrayList<Double>();
        dfs(root , list);
        return list;
    }
    public void dfs(TreeNode root, ArrayList list){
        
        Queue<TreeNode> q = new LinkedList<TreeNode>();
        q.add(root);
        int size = q.size();   
        while(!q.isEmpty()){
            long sum = 0 , count = 0;
            
            while(size > 0){
                TreeNode n = q.poll();
                sum += n.val;
                count++;
                
                if(n.left != null)
                    q.add(n.left);
                
                if(n.right != null)
                    q.add(n.right);
                
                size--;
                
            }
            if( size == 0){
            list.add(sum*1.0/count);
                size = q.size();
            }
                        
        }        
    }
}