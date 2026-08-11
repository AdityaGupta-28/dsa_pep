public class 15SubsetSumETarget {
    // Why Boolean[][] works
// Boolean is an object wrapper, so its default value is null.
// Therefore:
// dp[i][target]
// null   → not calculated
// true   → calculated, possible
// false  → calculated, impossible
         /////// Memoization
    static boolean solve(int i, int arr[], int target,Boolean[][]dp){
        if(target==0)return true;
        if(i==0){
            return target==arr[i];
        }
        if(dp[i][target]!=null)return dp[i][target];
        boolean take = false;
        boolean notake =  solve(i-1,arr,target,dp);
 
        if(target>=arr[i]){
            take = solve(i-1,arr,target-arr[i],dp);
        }
       return dp[i][target]= take || notake;
    }
    static boolean isSubsetSum(int arr[], int sum) {
       int n = arr.length;
    //   Boolean dp[][] = new Boolean[n][sum+1];
    //   return solve(n-1,arr,sum,dp);
       
              /////Tabulation
    //   boolean dp[][] = new boolean[n][sum+1];
    //   for(int i=0;i<n;i++)dp[i][0]=true;
    //   if(arr[0]<=sum) dp[0][arr[0]]=true;
       
    //   for(int i=1;i<n;i++){
    //       for(int j=1;j<=sum;j++){
    //           boolean take=false;
    //           boolean notake = dp[i-1][j];
    //           if(j>=arr[i]){
    //               take = dp[i-1][j-arr[i]];
    //           }
    //           dp[i][j] = take || notake;
    //       }
    //   }
    //   return dp[n-1][sum];
       
         //// Space Optimization
         boolean row[] = new boolean[sum+1];
         row[0]=true;
         if(arr[0]<=sum)row[arr[0]]=true;
         for(int i=1;i<n;i++){
              boolean temp[] = new boolean[sum+1];
              temp[0]=true;
             for(int j=1;j<=sum;j++){
               boolean take = false;
               boolean notake = row[j];
               if(j>=arr[i]) take = row[j-arr[i]];
               temp[j] = take || notake;
             }
             row = temp;
         }
         return row[sum];
        
    }
               
// Exactly — we do care about the true answer, but the reason we care about memoizing false is performance, not correctness.

// Let's see it with a simple example.

// Suppose we calculate a state

// Imagine:

// solve(i = 4, target = 7)

// After exploring all possibilities, suppose the answer is:

// false

// We store:

// dp[4][7] = false;

// Later, another recursive path reaches:

// solve(4, 7)
// We already calculated this exact state, so ideally we should immediately return:

// false
    
    //  static int solve(int i, int arr[], int target,int[][]dp){
    //     if(target==0)return 1;
    //     if(i==0){
    //         if(target==arr[i])return 1;
    //         return 2;
    //     }
    //     if(dp[i][target]!=-1)return dp[i][target];
    //     int take = 2;
    //     int notake =  solve(i-1,arr,target,dp);
 
    //     if(target>=arr[i]){
    //         take = solve(i-1,arr,target-arr[i],dp);
    //     }
    //   if(take==1 || notake==1)return dp[i][target]=1;
    //   return dp[i][target]=2;
    // }
    // static boolean isSubsetSum(int arr[], int sum) {
    //   int n = arr.length;
    //   int dp[][] = new int[n][sum+1];
    //   for(int x[]:dp){
    //       Arrays.fill(x,-1);
    //   }
    //   int a= solve(n-1,arr,sum,dp);
    //     return a==1;
    // }
}
