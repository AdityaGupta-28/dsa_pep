import java.util.*;
public class LRUQ {
    public class Node{
    int val;
    Node next; 
    Node prev;
    Node(){};
     Node(int data){
         val=data;
      }
    }
    class lru{
        int size=0;
        int capacity=3;
        Node head;
        Node tail;
    
        lru(int cap){
            capacity=cap;
        }
     Map<Integer,Node> map = new HashMap<>();
        
      
        public void removeNode(Node h){
            if(h==head){
                head=head.next;
                head.prev=null;
                return;
            }
            
         Node back = h.prev;
           h=h.next;
           h.prev=back;
           size--;
          
        }
        public void addNodeAtend(int val){
            Node node = new Node(val);
        
        if(head==null){
         head=node;
         tail=head;
         size++;
         return;
        }
        Node deleteNode;
        if(map.containsKey(val)){
         deleteNode = map.get(val);
         removeNode(deleteNode);

        }
        if(size==capacity){
            removeNode(obj.head);
        }
        node.prev=tail;
        tail.next=node;
        tail=node;
        size++;
        }
    }

    public void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int cap= sc.nextInt();
        lru obj = new lru(cap);
        obj.addNodeAtend(1);
        obj.remove
        obj.addNodeAtend(2);
        obj.addNodeAtend(3);
        obj.addNodeAtend(4);

        Node cur=obj.head;

        while(cur!=null){
            System.out.print(cur.val+" ");
            cur=cur.next;
        }
        
        
    }
}
