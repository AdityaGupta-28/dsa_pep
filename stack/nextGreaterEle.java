import java.util.*;
public class nextGreaterEle {
    public void nextGreater(int arr[]){
        int n = arr.length;
        Stack<Integer>st = new Stack<>();
       
        for(int i=n-1;i>=0;i--){
            int t = arr[i];
                while(!st.isEmpty() && st.peek()<=arr[i]){
                    st.pop();
                }
                if(st.isEmpty()){
                    arr[i]=-1;
                }
                else {
                    arr[i]=st.peek();
                }
                st.push(t);
               
            
        }
    }
    public void main(String[] args){
     int arr[] ={6,2,8,4,5,3,1};
     nextGreater(arr);
     System.out.print(Arrays.toString(arr));
    }
}
