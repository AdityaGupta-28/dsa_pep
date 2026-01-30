
import java.util.*;

public class findTargetMountain {
   
   public int peak(int[]arr){
    int l=1; int h=arr.length-1;
     int ans=-1;
      while(l<=h){
            int mid=l+(h-l)/2;          
            if(arr[mid]>arr[mid-1]){
               ans=mid;
                l=mid+1;
            }
                                      /// target element in mountain array
            else h=mid-1;
        }
        // return ans;
            //or
        return h;
    }
     public int binaryFirst(int[]arr,int l, int h,int target){
      int ans=-1;
        while(l<=h){
            int mid=l+(h-l)/2;
            if(arr[mid]==target){
            ans=mid;
             h=mid-1;
            } 

            else if(arr[mid]>target){
                h=mid-1;
            }
            else l=mid+1;
        }
        return ans;

    }

     public int binaryLast(int[]arr,int l, int h,int target){
      int ans=-1;
        while(l<=h){
            int mid=l+(h-l)/2;
            if(arr[mid]==target){
             
             return mid;
            } 
            else if(arr[mid]>target){
                l=mid+1;
            }
        else {   h=mid-1;   }
           
        }
        return ans; }
     public void main(String[] args){
        Scanner sc= new Scanner(System.in);      /// 1 3 4 5 9 6
        int n=sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
       int target=sc.nextInt();
      int peakIndx=peak(arr);
      int f=binaryFirst(arr,0, peakIndx, target);
      int l=binaryLast(arr,peakIndx,n-1,target);
        System.out.print(f+" "+l);
        
}
}
