package slidingWindow;

import java.util.Scanner;

public class OptimalLongestSubarrLesETK {
    
public int MaxLength(int[] arr, int k){
    int n=arr.length;
    int max=Integer.MIN_VALUE;
    int i=0, j=0,sum=0;

    while(j<n){
   sum+=arr[j];
   if(sum<=k){
    max=Math.max(max,j-i+1);
   }
   else{
    sum-=arr[i];
    i++;
   }
    }
     
    return max;
    
}
public void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n=sc.nextInt();
    int arr[]=new int[n];
    for(int i=0;i<n;i++){
        arr[i]=sc.nextInt();
    }
   int k= sc.nextInt();
    System.out.print(MaxLength(arr,k));
}
}
