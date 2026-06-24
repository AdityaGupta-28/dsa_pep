
import java.util.Scanner;
public class previousSmallestElement {
    public class Node{
    int val;
    Node next;
    Node(int v){
        val=v;
    }
    }
    public class stack{
        int size=0;
        Node head; 
        stack(){};
        public void push(int val){
            Node node = new Node(val);
        node.next=head;
        head=node;
        size++;
        }
    public int peek(){
        if(head!=null)return head.val;
        return -1;
        
    }

    public void pop(){
        if(head==null)return ;
        head=head.next;
        size--;
    }
    public boolean isEmpty(){
        if(head==null){
            return true;
        }
        return false;
    }
        
    }
    public  void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];

        // Stack<Integer> st = new Stack<>();
        stack st = new stack();

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < n; i++) {

            while (!st.isEmpty() && st.peek() >= arr[i]) {
                st.pop();
            }

            if (st.isEmpty()) {
                System.out.print(-1 + " ");
            } else {
                System.out.print(st.peek() + " ");
            }

            st.push(arr[i]);   
        }
    }
}
