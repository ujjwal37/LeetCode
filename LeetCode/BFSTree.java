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
    public List<List<Integer>> levelOrder(TreeNode root) {
     
        Queue<TreeNode> q = new LinkedList();
        List<List<Integer>> res = new ArrayList();
           if(root == null){
            return res;
        }
        q.add(root);
        while(q.size() > 0){
            List<Integer> arl = new ArrayList();
            int n = q.size();
            for(int i = 0;  i < n ; i++){
            TreeNode temp = q.poll();
            arl.add(temp.val);
                if(temp.left != null)
                    q.add(temp.left);
                
                if(temp.right != null)
                    q.add(temp.right);
        }
            res.add(arl);
    }
        return res;
}
}