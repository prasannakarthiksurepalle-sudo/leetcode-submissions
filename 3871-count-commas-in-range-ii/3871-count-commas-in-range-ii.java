class Solution {
    public long countCommas(long n) {
        long ans=0;
        long start=1000;
        long commas=1;
        long end;
        while(start<=n){
            end=Math.min(n,start*1000 - 1);
            ans+=(end-start + 1)*commas;
            start*=1000;
            commas++;
        }
        return ans;
    }
}