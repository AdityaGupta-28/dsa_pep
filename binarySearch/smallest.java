import java.util.Scanner;

public class smallest {
     
    // public int binarySea(int[]arr,int l, int h,int target){
    //     while(l<h){
    //         int mid=l+(h-l)/2;
    //         if(arr[mid]>target)return mid+1;
    //         else if(arr[mid]>target){
    //             h=mid-1;
    //         }
    //         else l=mid+1;
    //     }
    //     return -1;
    // }/// in a sorted , strictly increasing array find the smallest element which is greater than given element(not equal)

    public int binarySea(int[]arr,int l, int h, int target){
        int ans=-1;
        while(l<=h){
            int mid=l+(h-l)/2;
            if(arr[mid]>target){
                ans=mid;
                h=mid-1;
            }
            else l=mid+1;
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
        int target=sc.nextInt();

      int index=  binarySea(arr,0,n-1,target);
    
            System.out.print(arr[index]);
        
}
}
