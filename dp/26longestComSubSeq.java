public class 26longestSubSeq{
    public int longest(int n1, int n2, String s1, String s2, int[][]dp){
        if(n1<0 || n2<0)return 0;
        if(dp[n1][n2]!=-1)return dp[n1][n2];
        if(s1.charAt(n1)==s2.charAt(n2)){
            return dp[n1][n2] = 1 + longest(n1-1,n2-1,s1,s2,dp);
        }
        int left = longest(n1-1,n2,s1,s2,dp);
        int right = longest(n1,n2-1,s1,s2,dp);
        return dp[n1][n2]= Math.max(left,right);
    } 
    public int lcs(String s1, String s2) {
       int n1=s1.length();
       int n2=s2.length();
       int dp[][] = new int[n1][n2];
       for(int x[]:dp)Arrays.fill(x,-1);
       return longest(n1-1,n2-1,s1,s2,dp);
        
    }
}