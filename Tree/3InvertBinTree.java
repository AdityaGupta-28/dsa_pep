public   public TreeNode invertTree(TreeNode root) {
       if(root==null)return null;
    //    if(root.left==null && root.right==null)return root;
      invertTree(root.left);
      invertTree(root.right);
      TreeNode temp = root.left;
       root.left= root.right;
       root.right = temp;
       return root;
    } {
    
}
