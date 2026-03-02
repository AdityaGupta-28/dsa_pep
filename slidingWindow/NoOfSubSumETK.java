import java.util.*;
public class NoOfSubSumETK {
 // To find no. of subarrays whose sum equal to k we split it as
 // No. of subarrays whose sum <=k - sum<=k-1;

 public int subarray(int[]arr, int k){
    int n=arr.length;
    int i=0, j=0, sum=0;
    int nk1=0;
    int nk2=0;
    while(j<n){
        sum+=arr[j];
        if(sum<=k-1){
            nk1++;
        }
        if(sum<=k)nk2++;

        else{
            sum-=arr[i]; 
            i++;
        }
     j++;
    }
    return nk2-nk1;
 }
 public void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n=sc.nextInt();
    int arr[]=new int[n];
    for(int i=0;i<n;i++){
        arr[i]=sc.nextInt();
    }
   int k= sc.nextInt();
    System.out.print(subarray(arr,k));
}   
}
