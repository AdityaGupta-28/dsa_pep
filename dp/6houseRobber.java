package dp;
import java.util.*;
public class houseRobber {
   // public int maxAmount(int n, int[] nums, int[] dp){
    //     if(n==0)return Math.max(nums[0],0);
    //     if(n<0)return 0;
    //     if(dp[n]!=-1)return dp[n];
    //     int take=nums[n]+ maxAmount(n-2,nums, dp);
    //     int not_take = maxAmount(n-1,nums,dp);
    //     return dp[n]= Math.max(take,not_take);
    
    // }
    public int rob(int[] nums) {
        int n = nums.length;
        // int dp[] = new int[n];
        // Arrays.fill(dp,-1);
        // return maxAmount(n-1,nums,dp);

             ///// tabulation 
        // dp[0]=Math.max(0,nums[0]);
        // for(int i=1;i<n;i++){
        //     int take = nums[i];
        //     if(i>1)take+=dp[i-2];
        //     int not_take = dp[i-1];
        //     dp[i] = Math.max(take,not_take);
        // }
        // return dp[n-1];

            //// Space optimisation 
        int prev=Math.max(nums[0],0); int prev2=0;
         for(int i=1;i<n;i++){
            int take = nums[i];
            if(i>1)take+=prev2;
            int not_take = prev;
            prev2=prev;
            prev = Math.max(take,not_take);
         }
         return prev;
    }   
}
