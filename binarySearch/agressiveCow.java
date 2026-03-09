import java.util.Scanner;

public class agressiveCow {
    public boolean isPossible(int[]arr, int k, int min){
        int n=arr.length;
        int pos=arr[0];
        int count=1;
        for(int i=1;i<n;i++){
            if(arr[i]-pos>=min){
                count++;
                pos=arr[i];
                if(count==k)return true;
            }
        }
        return false;
    }
    public int binarySea(int[]arr,int k){
        int l=1; int  h= arr[arr.length-1]-arr[0];
        int ans=-1;
        while(l<=h){
           
            int mid=l+(h-l)/2;
            if(isPossible(arr,k,mid)){
                ans=mid;
                l=mid+1;
            } 
            
            else h=mid-1;
        }
        return ans;
    }
     public void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int k=sc.nextInt();

      int ans=  binarySea(arr,k);
    
            System.out.print(ans);
        
}
}
