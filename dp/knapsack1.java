import java.util.*;
public class knapsack1 {
    
         ///// Tabulation 
    // public int helper(int n,int w, int val[] , int wt[], int dp[][]){
    //     if(n==0 || w==0)return 0;
    //     if(dp[n][w]!=-1)return dp[n][w];
    //     if(w<wt[n-1])return dp[n][w]=helper(n-1,w,val,wt,dp);
    //     return dp[n][w]= Math.max(val[n-1]+helper(n-1,w-wt[n-1],
    //     val,wt,dp),helper(n-1,w,val,wt,dp));
    // }
    public int knapsack(int W, int val[], int wt[]) {
    int n = val.length;
    int dp[][] = new int[n+1][W+1];
    // for(int []row: dp){
    //     Arrays.fill(row,-1);
    // }
    //  return helper(n,W,val,wt,dp);
      
         ////Memoization 
         
        for(int i=0;i<n+1;i++){
            for(int j=0;j<W+1;j++){
                if(i==0 || j==0)dp[i][j]=0;
              else if(wt[i-1]>j)dp[i][j] = dp[i-1][j];
              else dp[i][j]= Math.max(val[i-1]+dp[i-1][j-wt[i-1]],dp[i-1][j]);
            }
        }
        return dp[n][W];    
    }

    public void main(String []args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int val[] = new int[n];
        int wt[] = new int[n];
        int W = sc.nextInt();
        for(int i=0;i<n;i++){
            val[i] = sc.nextInt();
        }
         for(int i=0;i<n;i++){
            wt[i] = sc.nextInt();
        }
  
         System.out.println(knapsack(W, val, wt));

    }


}
