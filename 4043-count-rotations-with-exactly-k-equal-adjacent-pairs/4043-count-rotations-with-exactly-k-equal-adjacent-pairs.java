class Solution {
    public int countRotations(String s, int k) {
        int n=s.length();
        boolean isSame=(s.charAt(0)==s.charAt(n-1));
        int initialPairs=0;
        for(int i=0;i<n-1;i++) if(s.charAt(i)==s.charAt(i+1)) initialPairs++;
        if(k < initialPairs-1 || k > initialPairs+1) return 0;
        if(isSame){
            if(k==initialPairs) return k+1;
            if(k==(initialPairs+1)) return n-initialPairs-1;
        }
        else{
            if(k==initialPairs-1) return initialPairs;
            if(k==initialPairs) return n-initialPairs;
        }
        return 0;
    }
}