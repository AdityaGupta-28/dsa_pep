package tcs;
import java.util.*;
public class productOfEleExceItself {
    public int[] productExceptSelf(int[] nums) {
        int prefix=1;
       int n = nums.length;
        int ans[] = new int[n];
        for(int i=0;i<nums.length;i++){
            ans[i]=prefix;
            prefix*=nums[i];
        }
        int suffix=1;
        for(int i=nums.length-1;i>=0;i--){
            ans[i]*=suffix;
            suffix*=nums[i];
        }
        return ans;
    }

    public void main(String[] args){
        int nums[] = {1,2,3,4};
        System.out.print(Arrays.toString(productExceptSelf(nums)));
    }
}
