import java.util.*;

public class span {
  
    public int fun(int[] arr){
        int n=arr.length;
        int max=0;
        Stack<Integer> st = new Stack<>();
        for(int i=0;i<n;i++){
            if(st.isEmpty())st.push(i);
            else{
                if(arr[st.peek()]>arr[i]){
                    st.push(i); }
            }     }
       for(int i=n-1;i>=0;i--){
        while(!st.isEmpty() && arr[i]>arr[st.peek()]){
        max= Math.max(max,i-st.peek()+1);
        st.pop();
        }
       }
       return max;
        
    }
    public void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] =new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
      System.out.print(fun(arr));

    }
}
