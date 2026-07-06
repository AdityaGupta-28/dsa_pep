import java.util.*;
public class deleteWithoutHead {
    class Node
{
    int data ;
    Node next;
    Node(int d)
    {
        data = d;
        next = null;
    }
}
*/
class Solution {
    public void deleteNode(Node del_node) {
        Node temp = del_node;
        Node prev= del_node;
    
        while(temp.next!=null){
            temp.data=temp.next.data;
            prev=temp;
            temp=temp.next;
        }
        prev.next=null;
        
        
    }
}

public class void main(String[] args){
    
}
}
