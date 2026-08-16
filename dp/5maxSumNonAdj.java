package dp;
import java.util.*;
public class maxSumNonAdj {
      public int maxsum(int n, int[]nums,int[] dp){
        if(n==0)return Math.max(nums[0],0);
        if(n<0)return 0;
        if(dp[n]!=-1)return dp[n];
        int take = nums[n] + maxsum(n-2,nums,dp);
        int not_take = maxsum(n-1,nums,dp);
        return dp[n] = Math.max(take,not_take);
    }
    public int nonAdjacent(int[] nums) {
       int n = nums.length;
       int[] dp = new int[n];
    //    Arrays.fill(dp,-1);
    //    return maxsum(n-1,nums,dp);
        
         //// Tabulation 

        // dp[0]=Math.max(nums[0],0);
        //  for(int i=1;i<n;i++){
        //     int left=nums[i];
        //     if(i>1)left = nums[i]+dp[i-2];
        //     int right = dp[i-1];
        //  dp[i] = Math.max(left,right);  
        //  }
        //  return dp[n-1];

        ///// Space optimization  

      int prev2 = 0; int prev=Math.max(nums[0],0); 
      for(int i=1;i<n;i++){
        int left = nums[i];
        if(i>1) left+=prev2;
        int right=prev;
        prev2=prev;
          prev=Math.max(left,right);
      }
      return prev;

    }

}
