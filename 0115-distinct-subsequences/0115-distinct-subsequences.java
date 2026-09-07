class Solution {
    public int numDistinct(String s, String t) {
        int s1=s.length(),t1=t.length();
        if(s1<t1) return 0;
        int[][] dp=new int[t1+1][s1+1];
        for(int i=0;i<=s1;i++) dp[0][i]=1;
        for(int i=1;i<=t1;i++) dp[i][0]=0;
        for(int i=1;i<=t1;i++){
            for(int j=1;j<=s1;j++){
                char c1=t.charAt(i-1);
                char c2=s.charAt(j-1);
                int skip=dp[i][j-1];
                int take=dp[i-1][j-1];
                if(c1==c2){
                    dp[i][j]=skip+take;
                }else{
                    dp[i][j]=skip;
                }
            }
        }
        return dp[t1][s1];
    }
}