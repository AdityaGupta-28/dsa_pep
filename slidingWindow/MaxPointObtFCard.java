import java.util.*;
public class MaxPointObtFCard {
    
    public int maxPoint(int[]arr,int k){
        int l=k-1; int r=0;
        int n=arr.length;
   
        int sum=0;
        for(int i=0;i<k;i++)sum+=arr[i];
        int max=sum;
        
        while(r<k){
          sum-=arr[l--];
          sum+=arr[n-1-r];
          r--;
          max=Math.max(max,sum);
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
    System.out.print(maxPoint(arr,k));
}  
}
