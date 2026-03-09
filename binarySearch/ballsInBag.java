import java.util.Arrays;
import java.util.Scanner;

public class ballsInBag {
    
    
    public int  operations(int nums[], int mid){
       int count=0;
       for(int num: nums){
         count+=(num-1)/mid;
       }
       return count;
    }
    public int minimumCost(int[] nums, int maxOper) {
    int  h = Arrays.stream(nums).max().getAsInt();
    int l=1;
     int ans=0;
        while(l<=h){
            int mid = l+(h-l)/2;
            if(maxOper>=operations(nums,mid)){
                ans=mid;
                h=mid-1;
            }
            else{
                l=mid+1;
            }
        }
        return ans;
    }

 public void main(String[] s){
    Scanner sc= new Scanner(System.in);
    int n=sc.nextInt();
    int arr[]=new int[n];
    for(int i=0;i<n;i++){
        arr[i]=sc.nextInt();
    }
    int maxOpe=sc.nextInt();
    System.out.println(minimumCost(arr,maxOpe));
 }
}

