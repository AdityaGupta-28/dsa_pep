package dp;
import java.util.*;
public class Mfibonaci {
 public int fib(int n,int[] arr){
    if(n<=1){
        arr[n]=n;
        return n; }
        if(arr[n]!=-1){
            return arr[n];
        }

    return arr[n]=fib(n-1,arr)+fib(n-2,arr);                    
 }           /// Memoization method 
    public void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        int arr[] = new int[n+1];
        Arrays.fill(arr,-1);
        int ans = fib(n,arr);
        System.out.print(ans);
    }
    
}
