package slidingWindow;

import java.util.Scanner;

public class BruteLongestSubarrLesETK {
    
public int MaxLength(int[] arr, int k){
    int n=arr.length;
    int max=Integer.MIN_VALUE;
    for(int i=0;i<n;i++){
      int sum=0;
      for(int j=i;j<n;j++){
       sum+=arr[j];
       if(sum<=k){
        max=Math.max(max,j-i+1);
       }
       else{
        break;
       }
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
