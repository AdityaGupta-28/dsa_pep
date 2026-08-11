public class 14CherryPick2 {
                ///// Memoization 
    public int memoization(int i, int j1, int j2, int[][]grid,int s,int c,int[][][]dp){
    if(j1<0 || j2<0|| j1>=c || j2>=c)return Integer.MIN_VALUE; //// added this
     if(i==s-1){
        if(j1==j2)return grid[i][j1];
     return grid[i][j1] + grid[i][j2];
     }
     if(dp[i][j1][j2]!=-1 ){
       return dp[i][j1][j2];
     }
     int max=0;
     for(int m=-1;m<=1;m++){
        for(int n=-1;n<=1;n++){
        int t;
        // if(j1+m>=0 && j1+m<c && j2+n>=0 && j2+n<c){
        if(j1==j2){ t= grid[i][j1]; }
        else t = grid[i][j1]+grid[i][j2]; 
        t+= memoization(i+1,j1+m,j2+n,grid,s,c,dp);
       
       max = Math.max(max,t);
        // }
        }
     }
      return dp[i][j1][j2]= max;
    }
    public int cherryPickup(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        int dp[][][] = new int[n][m][m];
    //    for(int[][] x:dp){
    //     for(int[]y: x){
    //         Arrays.fill(y,-1);
    //     }
    //    }
    //    return memoization(0,0,m-1,grid,n,m,dp);

              //// Tabulation 
        for(int j1=0;j1<m;j1++){
            for(int j2=0;j2<m;j2++){
                if(j1==j2)dp[n-1][j1][j2]=grid[n-1][j1];
               else  dp[n-1][j1][j2] = grid[n-1][j1] + grid[n-1][j2];
            }
        }
        for(int i=n-2;i>=0;i--){
            for(int j1=0;j1<m;j1++){
                for(int j2=0;j2<m;j2++){
                  int max=Integer.MIN_VALUE;
     for(int m1=-1;m1<=1;m1++){
        for(int n1=-1;n1<=1;n1++){
        int t;
        if(j1==j2){ t= grid[i][j1]; }
        else t = grid[i][j1]+grid[i][j2]; 
     if(j1+m1>=0 && j1+m1<m && j2+n1>=0 && j2+n1<m){
        t+= dp[i+1][j1+m1][j2+n1];
         max = Math.max(max,t);
     }

       
        }
     }
    dp[i][j1][j2]= max;
                }
            }
        }
        return dp[0][0][m-1];
    }
}
