public class 9IsBalancedTree {
      public int height(TreeNode root){
        if(root==null)return 0;
        return 1+ Math.max(height(root.left),height(root.right));
    }
    public boolean isBalanced(TreeNode root) {
        if(root==null)return true;
        int curleft = height(root.left);
        int curright = height(root.right);
        if(Math.abs(curleft-curright)>1)return false;
        boolean l = isBalanced(root.left);
        boolean r = isBalanced(root.right);
        return l&&r;
    }
    
}
