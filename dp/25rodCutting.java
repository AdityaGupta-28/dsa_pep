public class 25cuttingRod {
     public int maxProfit(int i, int l, int[]price, int dp[][]){
        if(i==0){
         return price[i]*(l/(i+1));
        }
        if(l==0)return 0;
        if(dp[i][l]!=-1)return dp[i][l];
        int notake = maxProfit(i-1,l,price,dp);
        int take=0;
        if(i+1<=l)take = price[i]+maxProfit(i,l-(i+1),price,dp);
        return dp[i][l] = Math.max(take, notake);
    }
    public int cutRod(int[] price) {
       int n = price.length;
       int dp[][] = new int[n][n+1];
       for(int x[]:dp){
           Arrays.fill(x,-1);
       }
       return maxProfit(n-1,n,price,dp);
        
    }
}
