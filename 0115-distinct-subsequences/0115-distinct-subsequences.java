class Solution {
    public int numDistinct(String s, String t) {
        int s1=s.length(),t1=t.length();
        if(s1<t1) return 0;
        int[][] dp=new int[s1][t1];
        for(int[] x:dp) Arrays.fill(x,-1);
        return calcSubsequences(s,t,s1-1,t1-1,dp);
    }
    int calcSubsequences(String s,String t,int i,int j,int[][] dp){
        if(j<0) return 1;
        if(i<0) return 0;
        if(dp[i][j]!= -1) return dp[i][j];
        char c1=s.charAt(i),c2=t.charAt(j);
        if(c1==c2) return dp[i][j]=calcSubsequences(s,t,i-1,j-1,dp)+calcSubsequences(s,t,i-1,j,dp);
        return dp[i][j]=calcSubsequences(s,t,i-1,j,dp);
    }
}