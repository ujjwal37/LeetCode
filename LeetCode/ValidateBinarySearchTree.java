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
   public boolean isValidBST(TreeNode root) {
        return check(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }
    public boolean check(TreeNode root, long min, long max) {
        if(root==null)
            return true;
        long v = root.val;
        return (v>min && v<max && check(root.left, min, v) && check(root.right, v, max));
    }
}