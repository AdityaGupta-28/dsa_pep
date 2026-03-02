import java.util.*;
public class linkedlist {
    public class Node{
        int val;
        Node next;
        Node(){};
    Node(int data){
     val=data;
     next=null;
    }
    }
    public class LinkedList{
    LinkedList(){};
    Node head;
    Node last;
    
    public void add(int data){
        Node node = new Node(data);
        if(head==null){
         head=node;
         head.next=null;
         last=head;
        }
        else{
            last.next=node;
            last=last.next;
        }
     }

     public void addfirst(int data){
        Node node= new Node(data);
        node.next=head.next;
        head=node;
     }
     
     public void deletelast(){
        Node temp= this.head;
        if(head==null || head.next==null)return;
        while(temp.next.next!=null){
             temp=temp.next;
        }
        temp.next=null;
     }

     public void deleteFirst(Node head){
        if(head== null )return ;
        head=head.next;
     }

    
    }
    
    public void main(String[] args){
        Scanner sc = new Scanner(System.in);
        LinkedList obj = new LinkedList();
        int n= sc.nextInt();
        for(int i=0;i<n;i++){
            int a=sc.nextInt();
            obj.add(a);
        }
        System.out.println("After Deletion of lastelement");
        // obj.deletelast();
        Node head=obj.head;
        while(head!=null){
            System.out.print(obj.head.val+" ");
            obj.head=obj.head.next;

        }
    }
}
