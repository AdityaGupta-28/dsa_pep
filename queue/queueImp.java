import java.util.*;
public class queueImp {
  
class myQueue{
    int front=-1; 
    int size;
    int rear = -1;
    int[] arr;
    myQueue(int s){
        size =s;
         arr = new int[s];
    }
 

    public void add(int v){
        if(rear<size){
            if(front==-1 && rear==-1){
                front++; rear++;
                arr[rear]=v;
                return;
            }
           arr[++rear]=v;
        }
        return;
    }

    public int peek(){
        if(front>=0)return arr[front];
        return -1;
    }

    public int remove(){
        if(front>=0 && front<=rear){
            int val = arr[front];
            front++;
            return val;
        }
        return -1;
    }
   

}

public void main(String[] args){
    myQueue queue = new myQueue(10);
   queue.add(1);
   queue.add(2);
   queue.add(3);
   queue.add(4);
   System.out.println(queue.peek());
   System.out.println(queue.remove());

}

    
}
