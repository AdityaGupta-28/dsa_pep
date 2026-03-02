package Tree;
import java.util.*;
public class dfs {

    static class Node {
        int val;
        Node left;
        Node right;

        Node(int d) {
            val = d;
            left = null;
            right = null;
        }
    }

    public static List<Integer> depth(Node root) {
        List<Integer> ans = new ArrayList<>();

        if (root == null)
            return ans;

        Stack<Node> st = new Stack<>();
        st.push(root);
       
        while(!st.isEmpty()){
            Node temp = st.pop();
            ans.add(temp.val);
            if(temp.right!=null)st.push(temp.right);
            if(temp.left!=null)st.push(temp.left);
        }
        return ans;
         
        }

    

   
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Example input:
        // 7
        // 1 2 3 4 5 6 7

        int n = sc.nextInt();

        if (n == 0) return;

        Node root = new Node(sc.nextInt());

        Queue<Node> q = new LinkedList<>();
        q.add(root);

        int count = 1;

        while (count < n) {

            Node current = q.remove();


            if (count < n) {
                Node left = new Node(sc.nextInt());
                current.left = left;
                q.add(left);
                count++;
            }

            
            if (count < n) {
                Node right = new Node(sc.nextInt());
                current.right = right;
                q.add(right);
                count++;
            }
        }

        List<Integer> result = depth(root);

        System.out.println(result);

        sc.close();
    }


}
