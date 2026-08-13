public class 10RightSViewTree {
    public List<Integer> rightSideView(TreeNode root) {
    List<Integer>list = new ArrayList<>();
     if(root==null)return list;
     Queue<TreeNode>q = new LinkedList<>();
     q.add(root);
     while(!q.isEmpty()){
        int size = q.size();
        int val=-1;
        for(int i=0;i<size;i++){
            TreeNode front = q.remove();
            val = front.val;
            if(front.left!=null)q.add(front.left);
            if(front.right!=null)q.add(front.right);
        }
        list.add(val);
     }
     return list;
    }
}
