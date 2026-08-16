package dp;
import java.util.*;
public class Tfibonaci {
 public int fib(int n,int[] arr){
    if(n<=1){
        arr[n]=n;
        return n; }
        if(arr[n]!=-1){
            return arr[n];
        }
                  /// Tabulation method (bottom up) space complexity O(n) while in memoization O(n)recu stack + O(n)
    return arr[n]=fib(n-1,arr)+fib(n-2,arr);
 }
    public void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        int arr[] = new int[n+1];
        Arrays.fill(arr,-1);
        int ans = fib(n,arr);
        System.out.print(ans);
    }
    
}


