public class 4SymmetricBinTree {
     public boolean checker(TreeNode left, TreeNode right){
        if(left == null && right==null)return true;
        if(left==null || right==null)return false;
        if(left.val!=right.val)return false;
        return checker(left.left,right.right) && checker(left.right, right.left);
    }
    public boolean isSymmetric(TreeNode root) {
        if(root==null)return true;
        return checker(root.left, root.right);
    }
}
