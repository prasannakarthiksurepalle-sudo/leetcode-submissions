class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n=s.length();
        if(n==0) return 0;
        int l=0;
        int ans=1;
        Map<Character,Integer> mp=new HashMap<>();
        for(int r=0;r<n;r++){
            char c=s.charAt(r);
            char lc;
            mp.put(c,mp.getOrDefault(c,0)+1);
            if(mp.get(c)>1){
                while(mp.get(c)>1){
                    lc=s.charAt(l);
                    mp.put(lc,mp.get(lc)-1);
                    if(mp.get(lc)==0){
                        mp.remove(lc);
                    } l++;
                }
            }
            ans=Math.max(ans,r-l+1);
        }
        return ans;
    }
}