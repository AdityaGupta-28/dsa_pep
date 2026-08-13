public class 11ZigZagTraversal {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
    List<List<Integer>>list  = new ArrayList<>();
    if(root == null)return list;
    Queue<TreeNode>q = new LinkedList<>();
    q.add(root);
     boolean check=true;
    while(!q.isEmpty()){
        int size = q.size();  
        List<Integer>temp =  new ArrayList<>();
      for(int i=0;i<size;i++){
        TreeNode front = q.remove();
        if(check)temp.add(front.val);
        else temp.add(0,front.val);
        if(front.left!=null)q.add(front.left);
        if(front.right!=null)q.add(front.right);
      }
      check=!check;
      list.add(temp);
    }
    return list;
    }
}
