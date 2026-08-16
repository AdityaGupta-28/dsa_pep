public class 17partitionTwoSubSetSumMinDiff{
 
public int minDifference(int[] nums) {
       int sum = Arrays.stream(nums).sum(); 
       int n = nums.length;

          ///// Tabulation 
    //   boolean dp[][] = new boolean[n][sum+1];
    //       dp[0][0]=true;
    //     if(nums[0]<=sum){
    //         dp[0][nums[0]] = true;
    //     }
    //   for(int i=1;i<n;i++){
    //       for(int j=0;j<=sum;j++){

    //           boolean take = false;
    //           boolean notake = dp[i-1][j];
    //           if(nums[i]<=j)take = dp[i-1][j-nums[i]];
    //           dp[i][j] = take||notake;                

    //       }
    //   }
    //       int min=Integer.MAX_VALUE;
    //       for(int j=0;j<=(sum/2);j++){
    //          if(dp[n-1][j]==true){
    //           min = Math.min(min,Math.abs(sum-j-j));
    //          }
    //       }
    
            ////// Space Optimisation 
            
        boolean row[] = new boolean[sum+1];
        row[0] = true;
        if(nums[0]<=sum)row[nums[0]]=true;
        for(int i=1;i<n;i++){
            boolean temp[] = new boolean[sum+1];
            for(int j=0;j<sum+1;j++){
                boolean take = false;
                boolean notake = row[j];
                if(nums[i]<=j)take = row[j-nums[i]];
                temp[j]= take||notake;
            }
            row = temp;
        }
        
        int min = Integer.MAX_VALUE;
        for(int i=0;i<=sum/2;i++){
            if(row[i]==true){
                min = Math.min(min,Math.abs(sum-i-i));
            }
        }

       return min;
   }
}