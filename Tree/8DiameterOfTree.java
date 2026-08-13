public class 8DiameterOfTree {
    public int height(TreeNode root){
        if(root==null)return 0;
        return 1+ Math.max(height(root.left),height(root.right));
    }
    public int diameterOfTree(TreeNode root){
        if(root==null)return 0;
        int cur = height(root.left)+height(root.right);
        int left = diameterOfTree(root.left);
        int right = diameterOfTree(root.right);
        return Math.max(cur, Math.max(left,right));

    }
}
