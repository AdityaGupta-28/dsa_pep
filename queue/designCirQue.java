import java.util.*;

class designCirQue{
  
    class MyCircularQueue {
     int arr[];
     int front=0; int rear=-1;
     int count=0;
     int size;
    public MyCircularQueue(int k) {
        arr = new int[k];  
        size=k;  
    }
   
   
    
    
    public boolean enQueue(int value) {
        if(isFull())return false;
        rear=(rear+1)%size;
        arr[rear]=value;
        count++;
        return true;
    }
    
    public boolean deQueue() {
        if(isEmpty())return false;
          front = (front+1)%size;
          count--;
          return true;
    }
    
    public int Front() {
        if(isEmpty())return -1;
        return arr[front];
    }
    
    public int Rear() {
        if(isEmpty())return -1;
        return arr[rear];
    }
    
    public boolean isEmpty() {
        return count==0;
    }
    
    public boolean isFull() {
        return count==size;
    }
}
    public void main(String[] args){
    MyCircularQueue q = new MyCircularQueue(7);
    
    }
}