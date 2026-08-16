public class 22targetSum {
      public int findways(int i,int[]nums, int newtarget, int[][]dp){
        if(i==0){
            if(nums[i]==0 && newtarget==0)return 2;
            else if(newtarget==0 || nums[i]==newtarget)return 1;
            return 0;
        }
       
        if(dp[i][newtarget]!=-1)return dp[i][newtarget];
        int take=0;
        int notake = findways(i-1,nums, newtarget,dp);
        if(nums[i]<=newtarget)take=findways(i-1,nums,newtarget-nums[i],dp);
       return dp[i][newtarget] = take+notake;
    }
    public int findTargetSumWays(int[] nums, int target) {
        int n = nums.length;
        int total = Arrays.stream(nums).sum();
        int newtarget = target+total;
        if(newtarget<0 || newtarget%2!=0)return 0;
        newtarget/=2;
        int dp[][] = new int[n][newtarget+1];
        // for(int[] x:dp){
        //     Arrays.fill(x,-1);
        // }
        // return findways(n-1,nums,newtarget,dp);
    //        ///// tabulation 
       for(int j=0;j<=newtarget;j++){
          if(nums[0]==0 && j==0)dp[0][0]=2;
          else if(nums[0]==j || j==0)dp[0][j]=1;
          else dp[0][j]=0;
       }
       for(int i=1;i<n;i++){
        for(int j=0;j<=newtarget;j++){
            int notake = dp[i-1][j];
            int take =0;
            if(nums[i]<=j)take = dp[i-1][j-nums[i]];
            dp[i][j] = take+notake;
        }
       }
       return dp[n-1][newtarget];

        ///// Space optimisation
    
    //     int row[] = new int[newtarget+1];
    //     if(nums[0]==0)row[0]=2;
    //     else row[0]=1;
    //     if(nums[0]!=0 && nums[0]<=newtarget)row[nums[0]]=1;
        
    //     for(int i=1;i<n;i++){
    //         int []temp = new int[newtarget+1];
    //         for(int j=0;j<=newtarget;j++){
    //             int take =0;
    //             int notake = row[j];
    //             if(nums[i]<=j) take=row[j-nums[i]];
    //             temp[j] = take+notake;
    //         }
    //         row = temp;
    //     }
    //    return row[newtarget];
    }
}
