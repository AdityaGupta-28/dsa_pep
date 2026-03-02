import java.util.Scanner;

public class reverse {
 public   class Node{
     int val;
     Node next;
     Node(int data){ val=data;}
    }
   public void reverse(Node head){
    Node cur=head;
    Node thead=null;
    while(cur!=null){
        Node nxt = cur.next;
        cur.next=thead;
        thead=nxt;
        cur=nxt;
    }
   }
    public void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int d=sc.nextInt();

    }
}
