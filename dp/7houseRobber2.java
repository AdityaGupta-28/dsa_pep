package dp;
import java.util.*;
public class houseRobber2 {
     // public int maxAmount(int n, int[] nums, int[] dp){
        
    //     if(n==0)return Math.max(nums[0],0);
    //    if(n<0) return 0;
    
    //     if(dp[n]!=-1)return dp[n];
    //     int take=nums[n]+ maxAmount(n-2,nums, dp);
    //     int not_take = maxAmount(n-1,nums,dp);
    //     return dp[n]= Math.max(take,not_take);
    
    // }
    public int rob(int[] nums) {
        int n = nums.length;
        if(n==1)return nums[0];
        int temp[] = new int[n-1];
        for(int i=1;i<n;i++){
          temp[i-1]=nums[i];
        }  
     int[] dp = new int[n-1];

           //// Memoization
    
    //     Arrays.fill(dp,-1);
    //   int first= maxAmount(n-2,nums,dp);
    //    Arrays.fill(dp,-1);
    //   int last = maxAmount(n-2,temp,dp);
    //   return Math.max(first,last);

           /// Space optimization
        int prev2=0; int prev = Math.max(nums[0],0);
        for(int i=0;i<n-1;i++){
            int left = nums[i];
            if(i>1)left+=prev2;
           int right= prev;
           prev2=prev;
           prev = Math.max(left,right);
        }
        int first = prev;
        prev2=0; prev=Math.max(nums[1],0);
        for(int i=1;i<n;i++){
            int left = nums[i];
            if(i>2)left+=prev2;
            int right  = prev;
            prev2=prev;
            prev = Math.max(left,right);
        }
        return Math.max(first,prev);
    }
}
