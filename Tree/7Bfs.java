import java.util.*;
public class 7Bfs{
 
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>>list = new ArrayList<>();
    if(root==null)return list;   
    Queue<TreeNode>q = new LinkedList<>();
    q.add(root);
    while(!q.isEmpty()){
        int size = q.size();
        List<Integer>temp = new ArrayList<>();
        for(int i=0;i<size;i++){
            TreeNode front = q.remove();
            temp.add(front.val);
            if(front.left!=null)q.add(front.left);
            if(front.right!=null)q.add(front.right);
        }
        list.add(temp);
    }
    return list;
    }
}