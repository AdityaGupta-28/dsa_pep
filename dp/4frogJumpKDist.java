package dp;
import java.util.*;
public class frogJumpKDist {
               ///// Memoization 
    // public int helper(int n, int[] heights, int k, int[] dp ){
    //  if(n==0)return 0;
    //  if(dp[n]!=-1)return dp[n];
    //  int min = Integer.MAX_VALUE;
    // for(int j=1;j<=k;j++){
    //     if(n-j>=0){
    //     int left = (Math.abs(heights[n]-heights[n-j])+ helper(n-j,heights, k, dp));
    //      min = Math.min(min,left);
    //     }       
    // }
    //  dp[n]=min;
    // return min;
    // }

    public int frogJump(int[] heights, int k) {
      int n = heights.length;
       int dp[] = new int[n];
    //    Arrays.fill(dp,-1);
    //    return helper(n-1,heights,k,dp);

            //// Tabulation 
        dp[0]=0;
        for(int i=1;i<n;i++){
            int min = Integer.MAX_VALUE;
            for(int j=1;j<=k;j++){
                if(i-j>=0){
                    int left = dp[i-j]+ Math.abs(heights[i]-heights[i-j]);
                    min = Math.min(min,left);
                }
               
            }
             dp[i]=min;
        }
        return dp[n-1];

    }

    public void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int  heights[] = new int[n];
        for(int i=0;i<n;i++){
            heights[i] = sc.nextInt();
        }
        System.out.println(frogJump(heights,k));
    }
}
