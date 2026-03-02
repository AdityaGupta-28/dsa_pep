import java.util.*;
public class BetterLongestSubLesETK {
    public int MaxLength(int[] arr, int k){
        int n=arr.length;
        int i=0; int j=0;
        int max=Integer.MIN_VALUE;
        int sum=0;
        while(j<n){
         sum+=arr[j];
           while(sum>k){
                sum-=arr[i];
                i++;
            }

         if(sum<=k){
            max=Math.max(max,j-i+1);
         }
         
         j++;
        }
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
