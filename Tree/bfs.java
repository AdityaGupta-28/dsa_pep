import java.util.*;

public class bfs {

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

    public static List<List<Integer>> levelOrder(Node root) {
        List<List<Integer>> ans = new ArrayList<>();

        if (root == null)
            return ans;

        Queue<Node> q = new LinkedList<>();
        q.add(root);

        while (!q.isEmpty()) {
            int size = q.size();
            List<Integer> level = new ArrayList<>();

            for (int i = 0; i < size; i++) {
                Node node = q.remove();

                level.add(node.val);

                if (node.left != null)
                    q.add(node.left);

                if (node.right != null)
                    q.add(node.right);
            }

            ans.add(level);
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

        List<List<Integer>> result = levelOrder(root);

        System.out.println(result);

        sc.close();
    }
}
