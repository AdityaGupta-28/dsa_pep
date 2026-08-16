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
        newtarget = Math.abs(newtarget);
        int dp[][] = new int[n][newtarget+1];
        for(int[] x:dp){
            Arrays.fill(x,-1);
        }
        return findways(n-1,nums,newtarget,dp);
    }
}
