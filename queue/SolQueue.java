import java.util.*;

public class SolQueue {
   public class Node{
        int val;
        Node next;
        Node(int d){
            val=d;
        }
    }
public class queue{
Node head;
Node tail;
int size=0;
queue(){}
 public  int front(){
   if(head!=null)return head.val;
   return -1;
    }

   public int size(){
     return size; }
  
    public void push(int d){
      Node node = new Node(d);
      if(head==null){
        head=node; tail=node;
      }
      tail.next=node;
      tail=tail.next;
    }

    public int pop(){
        int val=-1;
        if(head==null)return val;
        if(head==tail){
            val=head.val;
            tail=null;
            head=null;
            return val;
        }
        else{
            val=head.val;
            head=head.next;
        }
        return val;
    }
   public void print(){
    Node temp = head;
    while(temp!=null){
        System.out.print(temp.val+" ");
        temp= temp.next;
    }
   }
  public boolean isEmpty(){
    return size==0;
  }

}

public void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int a=sc.nextInt();
     int b=sc.nextInt();
     int c = sc.nextInt();
     queue obj = new queue();
   obj.push(a);
   obj.push(b);
   obj.pop();
   obj.push(c);
 obj.print();

}
    
}
