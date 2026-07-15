import java.util.*;
public class preorder {
    class  Node{
        int val;
        Node left;
        Node right;
        Node (int v){
            val= v;
        }
    }

     public void preorder(Node root){
      if(root==null)return;
      System.out.print(root.val+" ");
      preorder(root.left);
      preorder(root.right);
     }
    public void main(String[] args){
        Node root= new Node(1);
        Node n1= new Node(2);
        root.left=n1;
        Node n2= new Node(3);
        root.right=n2;
        Node n3= new Node(4);
        root.left.left=n3;
        Node n4= new Node(5);
        root.left.right = n4;

        preorder(root);

    }
}
