import java.util.*;
public class nextSmallest {
    
    public void nextSmallestEle(int[] arr){
        int n = arr.length;
        Stack<Integer>st = new Stack<>();
        for(int i=n-1;i>=0;i--){
            int t = arr[i];
            while(!st.isEmpty() && st.peek()>=arr[i])st.pop();
            if(st.isEmpty())arr[i]=-1;
            else arr[i] = st.peek();
            st.push(t);
        }
    }
    public void main(String[] args){
        int arr[] ={2,4,1,8,5,0,3};
        nextSmallestEle(arr);
        System.out.print(Arrays.toString(arr));
    }
}
