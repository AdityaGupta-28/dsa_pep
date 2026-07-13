import java.util.*;
public class insertAtBottomStack {
    
public void insertAtBottomOfStack(Stack<Integer>st, int x){
   if(st.isEmpty()){
    st.push(x);
    return;}
    int a = st.pop();
    insertAtBottomOfStack(st, x);
    st.push(a);
   }

public void main(String[] args){
 Stack<Integer>st = new Stack<>();
 insertAtBottomOfStack(st, 0);
st.push(1);
st.push(2);
st.push(3);
st.push(4);
 while(!st.isEmpty()){
    System.out.print(st.pop()+" ");
 }
}
}
