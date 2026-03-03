import java.util.*;
public class binarySearch {
    
    public int binarySea(int[]arr,int l, int h,int target){
        
        while(l<=h){
            int mid=l+(h-l)/2;
            if(arr[mid]==target)return mid;
            else if(arr[mid]>target){
                h=mid-1;
            }
            else l=mid+1;
        }
        return -1;
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
    
            System.out.print(index);
        
}
}