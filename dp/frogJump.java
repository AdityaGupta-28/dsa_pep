package dp;
import java.util.*;
public class frogJump {

              ////// Memoizaton 
// 	public int helper(int n, int[] height, int[] dp) {
// 		if (n == 0)return dp[n] = 0;
// 		if (dp[n] != -1)return dp[n];
// 		int left = Math.abs(height[n]-height[n - 1]) + helper(n - 1, height, dp);
// 		int right = Integer.MAX_VALUE;
// 		if (n>1) right = Math.abs(height[n]-height[n - 2])
// 			+ helper(n - 2, height, dp);
// 		return dp[n] = Math.min(left, right);
// 	}
	
	int minCost(int[] height) {
		int n = height.length;
		int dp[] = new int[n];
// 		Arrays.fill(dp, -1);
// 		return helper(n - 1, height, dp);
        
         ///// tabulation  
    //      dp[0]=0;
    //     for(int i=1;i<n;i++){
    //         int left = Math.abs(height[i]-height[i-1])+dp[i-1];
    //         int right = Integer.MAX_VALUE;
    //         if(i>1)right = Math.abs(height[i]-height[i-2])+dp[i-2];
    //         dp[i] = Math.min(left,right);
    //     }
    // return dp[n-1];
    
       ////// Space Optimization 
       int prev=0; int prev2=0;
       for(int i=1;i<n;i++){
           int left = Math.abs(height[i]-height[i-1])+prev;
           int right = Integer.MAX_VALUE;
           if(i>1)right = Math.abs(height[i]-height[i-2])+prev2;
           prev2=prev;
           prev = Math.min(left,right);
       }
		return prev;
	}
    
    public void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int height[] = new int[n];
        for(int i=0;i<n;i++){
            height[i] = sc.nextInt();
        }
        System.out.println(minCost(height));
    }

}
