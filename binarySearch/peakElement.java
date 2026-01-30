import java.util.Scanner;

public class peakElement {
public int peak(int[]arr){
    int l=0; int h=arr.length-1;
     int ans=0;
      while(l<=h){
            int mid=l+(h-l)/2;
           
            if(arr[mid]>ans){
               ans=arr[mid];
                l=mid+1;
            }
                                      /// peak element in mountain array
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
       

      int ele=peak(arr);
    
            System.out.print(ele);
        
}
}
