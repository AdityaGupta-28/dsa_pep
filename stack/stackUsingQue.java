import java.util.*;
public class stackUsingQue {
      class myStack {
    Queue<Integer> q = new LinkedList<>();
    Queue<Integer>qempty = new LinkedList<>();
    void push(int x) {
        qempty.add(x);
        while(!q.isEmpty()){
            qempty.add(q.remove());}
          
         Queue<Integer> temp = q;
        q = qempty;
        qempty = temp;
            
    }

    int pop() {
        if(!q.isEmpty()){
            return  q.remove();
        }
      return -1;
    }

    int top() {
        if(q.isEmpty())return -1;
        return q.peek();
    }

    int size() { 
        return q.size();
    }
}
     public void main(String[] args){
        myStack st = new myStack();
        st.push(1);
         st.push(2);
         st.push(3);
         st.push(4);
         st.pop();
         System.out.println(st.top());
     

    }
}
