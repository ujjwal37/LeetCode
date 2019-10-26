class Solution {
    public boolean btreeGameWinningMove(TreeNode root, int n, int x) {
        TreeNode red = find(root, x);
        int leftNum = count(red.left);
        int rightNum = count(red.right);
        int parentNum = n - leftNum - rightNum - 1;
        if(leftNum > n - leftNum || rightNum > n - rightNum || parentNum > n - parentNum) {
            return true;
        } else {
            return false;
        }
    }
    private TreeNode find(TreeNode root, int x) {
        if(root == null) {
            return null;
        }
        if(root.val == x) {
            return root;
        } else {
            TreeNode left = find(root.left, x);
            TreeNode right = find(root.right, x);
            if(left != null) {
                return left;
            }
            if(right != null) {
                return right;
            }
            return null;
        }
    }
    private int count(TreeNode red) {
        if(red == null) {
            return 0;
        }
        return 1 + count(red.left) + count(red.right);
    }
}