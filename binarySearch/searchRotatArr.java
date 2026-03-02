import java.util.*;
public class searchRotatArr {
    public int search(int[] nums, int target) {
        int l=0;int h=nums.length-1;
        while(l<=h){
            int mid=l+(h-l)/2;
            if(nums[mid]==target)return mid;

            else if(nums[l]<=nums[mid]){
                if(nums[l]<=target && nums[mid]>target){
                    h=mid-1; }
                else{
                 l=mid+1;
                }
            }
            else{
                if(nums[mid]<target && target<=nums[h] ){
                    l=mid+1;
                }
                else{
                    h=mid-1;
                }
            }
        }
        return -1;
    }
   public void main(String[] st){
    Scanner sc = new Scanner(System.in);
    int n=sc.nextInt();
    int arr[]=new int[n];
    for(int i=0;i<n;i++){
        arr[i]=sc.nextInt();
    }
    int target = sc.nextInt();
    System.out.print(search(arr, target));
   }
}
