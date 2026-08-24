public class 33distinctSubseq {
     public int lengthOfDSubseq(int n1,int n2, String s, String t,int[][]dp){
       if(n2==0)return 1;
       if(n1==0)return 0;
       if(dp[n1][n2]!=-1)return dp[n1][n2];
       if(s.charAt(n1-1)==t.charAt(n2-1)){
       return dp[n1][n2] = lengthOfDSubseq(n1-1,n2-1,s,t,dp)+lengthOfDSubseq(n1-1,n2,s,t,dp);
       }
       else return dp[n1][n2] = lengthOfDSubseq(n1-1,n2,s,t,dp);
    }
    public int numDistinct(String s, String t) {
        int n1 = s.length();
        int n2= t.length();
        int dp[][] = new int[n1+1][n2+1];
        for(int x[]:dp)Arrays.fill(x,-1);
        return lengthOfDSubseq(n1,n2,s,t,dp);
    }
}
