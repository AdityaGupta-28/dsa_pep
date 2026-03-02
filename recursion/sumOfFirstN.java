package recursion;

import java.util.Scanner;

public class sumOfFirstN {
    public int fun(int n){
    if(n<1)return 0;
    return n+fun(n-1);
    }
    //  public void fun(int i, int sum){
    //     if(i<1){
    //          System.out.print(sum);
    //        return;
    //     }
    //     fun(i-1,sum+i);
    //  }
     public void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum= fun(n);
        System.out.print(sum);
       
       
    }
}
