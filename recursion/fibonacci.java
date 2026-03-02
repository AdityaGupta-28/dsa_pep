package recursion;

import java.util.Scanner;

public class fibonacci {
     public int fib(int n){
        if(n<=n )return n;
     return fib(n-1)+fib(n-2);
     }
       public void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.print(fib(n));
}
}