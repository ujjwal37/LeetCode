public int sumNumbers(TreeNode root) {
        if(root==null) return 0;
        helper(root,0);
        return helper2(root);
    }
    
    public void helper(TreeNode root,int sum){ //save the sum to the leaf node
        if(root.left==null && root.right==null) {
            sum = sum*10+root.val;
            root.val=sum;
            return;
        }
        sum = sum*10+root.val;
        if(root.left!=null) helper(root.left,sum);
        if(root.right!=null) helper(root.right,sum);
    }
    
    public int helper2(TreeNode root){ //sum the leaf node
        if(root.left==null && root.right==null){
            return root.val;
        }
        
        int sum=0;
        if(root.left!=null) sum += helper2(root.left);
        if(root.right!=null) sum += helper2(root.right);
        return sum;
    }