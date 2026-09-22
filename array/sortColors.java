package array;
import java.util.*;
public class sortColors {
  public void sort(int[]nums){
    int n = nums.length;
    int l=0; int mid =0 ; int h=n-1;
    while(mid<=h){
        if(nums[mid]==0){
            int temp = nums[l];
            nums[l] = nums[mid];
            nums[mid]=temp;
            mid++; l++;
        }
        else if(nums[mid]==1)mid++;

        else{
            int temp = nums[h];
            nums[h] = nums[mid];
            nums[mid] = temp;
            h--;
        }
    }
  }  
}
