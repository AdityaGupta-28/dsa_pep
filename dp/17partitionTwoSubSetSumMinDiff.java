public class 17partitionTwoSubSetSumMinDiff{
 
  public int minDifference(int[] nums) {
       int sum = Arrays.stream(nums).sum(); 
       int n = nums.length;

          ///// Tabulation 
       boolean dp[][] = new boolean[n][sum+1];
           dp[0][0]=true;
        if(nums[0]<=sum){
            dp[0][nums[0]] = true;
        }
       for(int i=1;i<n;i++){
           for(int j=0;j<=sum;j++){

               boolean take = false;
               boolean notake = dp[i-1][j];
               if(nums[i]<=j)take = dp[i-1][j-nums[i]];
               dp[i][j] = take||notake;                

           }
       }
          int min=Integer.MAX_VALUE;
           for(int j=0;j<=(sum/2);j++){
             if(dp[n-1][j]==true){
               min = Math.min(min,Math.abs(sum-j-j));
             }
           }

       return min;
   }
}