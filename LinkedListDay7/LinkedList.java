import java.util.*;

public class LinkedList {
 public class Node {
     int val;
     Node next;
     Node prev;
      Node(int x){val=x; next=null; prev=null;}
  };

public class deque{
    Node head;
    Node tail;
    int size=0;
deque(){};
 deque(Node head){ this.head=head; };
 public boolean isEmpty(){
    return head==null;
 }
  public void push(int data){
      Node node= new Node(data);
    if(isEmpty()){
      head=node;
      tail=head;
      size++;
    } 
    else{
    //    Node temp=head;
    //    while(temp.next!=null){
    //     temp=temp.next;
    //    }
    //   temp.next=node;
    //   node.prev=temp;
    //   tail=node;
      node.prev=tail;
      tail.next=node;
      tail=node;
      size++;
    }    
  }

  public void pop(){
     if(head.next!=null){
        head=head.next; size--; }  
    else if(isEmpty())size=0;
    else {
        head=null;
        tail=null;
    } 
  }

  public void popback(){
    if(!isEmpty()){
        if(tail.prev!=null){
            tail=tail.prev;
     tail.next=null;
     size--;}
        
     else{
            tail=null;
            head=null;
            size--;
        }
    }

  }
 public int peek(){
    return tail.val;
 }


    } 
public void main(String[] agrs){
  Scanner sc = new Scanner(System.in);
  int data=sc.nextInt();
  deque dq= new deque();
  dq.push(data);
  int d=sc.nextInt();
  dq.push(d);
   dq.push(data);
  dq.popback();

Node head=dq.head;
System.out.println(dq.size);
if(head==null)System.out.println("Empty");
else{
while(head!=null){
    System.out.print(head.val+" ");
    head=head.next;
} }
}

}
