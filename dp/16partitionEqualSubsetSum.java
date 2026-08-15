public class 16partionEqualSubsetSum {
               ///// Memoization
    public boolean subsetSum(int i, int[]nums, int target,Boolean[][]dp){
        if(target==0)return true;
        if(i==0)return nums[i]==target;
        if(dp[i][target]!=null)return dp[i][target];
        boolean take = false;
        boolean notake = subsetSum(i-1,nums,target,dp);
        if(nums[i]<=target) take = subsetSum(i-1,nums,target-nums[i],dp);
        return dp[i][target] = take||notake;
    }
    public boolean canPartition(int[] nums) {
        int sum = Arrays.stream(nums).sum(); 
        int n = nums.length;
        int half = sum/2;
        if(half!=sum-half)return false;
        // Boolean dp[][] = new Boolean[n][half+1];
        // return subsetSum(n-1,nums,half,dp);
           ///// Tabulation 
        // boolean dp[][] = new boolean[n][half+1];
        //     dp[0][0]=true;
        // if(nums[0]<=half){
        //     dp[0][nums[0]] = true;
        // }
        // for(int i=1;i<n;i++){
        //     for(int j=0;j<=half;j++){
             
        //         boolean take = false;
        //         boolean notake = dp[i-1][j];
        //         if(nums[i]<=j)take = dp[i-1][j-nums[i]];
        //         dp[i][j] = take||notake;                
               
        //     }
        // }
        // return dp[n-1][half];

        boolean row[] = new boolean[half+1];
        row[0]=true;
        if(nums[0]<=half)row[nums[0]]=true;
         for(int i=1;i<n;i++){
            boolean temp[] = new boolean[half+1];
            for(int j=0;j<=half;j++){ 
                boolean take = false;
                boolean notake = row[j];
                if(nums[i]<=j)take = row[j-nums[i]];
                temp[j] = take||notake;                               
            }
            row = temp;
        }
        return row[half];
    }
}
