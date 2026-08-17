public class 23coinChange2 {
     public int findways(int i, int[] coins, int amount, int[][]dp){
        if(i==0){
            if(amount%coins[i]==0)return 1;
            return 0;
        }
        if(amount==0)return 1;
        if(dp[i][amount]!=-1)return dp[i][amount];
        int notake = findways(i-1, coins, amount,dp);
        int take=0;
        if(coins[i]<=amount)take = findways(i,coins, amount-coins[i],dp);
        return dp[i][amount] = take+notake;
    }
    public int change(int amount, int[] coins) {
        int n = coins.length;
        // int dp[][] = new int[n][amount+1];
        // for(int x[]:dp){
        //     Arrays.fill(x,-1);
        // }
        // return findways(n-1, coins, amount, dp);

              ///// Space optimization 
         int row[] = new int[amount+1];
         for(int j=0;j<=amount;j++){
          
            if(j%coins[0]==0)row[j]=1;
            else row[j] = 0;
         }
         
        for(int i=1;i<n;i++){
            int temp[] = new int[amount+1];
         for(int j=0;j<=amount;j++){
         int notake = row[j];
         int take =0;
         if(coins[i]<=j)take = temp[j-coins[i]];
         temp[j] = take+notake;
         }
         row = temp;
        }
        return row[amount];
    }
}
