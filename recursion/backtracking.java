package recursion;

import java.util.Scanner;


public class backtracking { // 4 3 2 1
 public void fun(int i,int n){
    if(i>n)return ;
    fun(i+1,n);
     System.out.print(i+ " ");
}

    public void backtrack(int i){
    if(i<1)return;
     backtrack(i-1);
     System.out.print(i+ " ");
    }
    public void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        backtrack(n);
        fun(1,n);
    }
    
}
