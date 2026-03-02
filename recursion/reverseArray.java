package recursion;

import java.util.Scanner;

public class reverseArray {
    
     public void reverse(int[] arr, int i, int j){
        if(i==j)return;
        int temp = arr[i];
        arr[i]=arr[j];
        arr[j]=temp; i++; j--;
        reverse(arr,i,j);
        
     }
    
     public void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
       int arr[]=new int[n];
       for(int i=0;i<n;i++){
        arr[i]=sc.nextInt();
       }
        reverse(arr,0,n-1);
        for(int x:arr){
        System.out.print(x+" ");}
    }
}
