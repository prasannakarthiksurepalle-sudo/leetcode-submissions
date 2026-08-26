class Solution {
    public String shortestBeautifulSubstring(String s, int k) {
        List<String> beauty=new ArrayList<>();
        int n=s.length();
        for(int i=0;i<n;i++){
            int cnt=0;
            if(s.charAt(i)=='1') cnt++;
            if(cnt==k) beauty.add(s.substring(i,i+1));
            for(int j=i+1;j<n;j++){
                if(s.charAt(j)=='1') cnt++;
                if(cnt==k) beauty.add(s.substring(i,j+1));
                if(cnt>k) break;
            }
        }
        int minLen=101;
        for(String x:beauty){
            minLen=Math.min(minLen,x.length());
        }
        List<String> rem=new ArrayList<>();
        for(String x:beauty){
            if(x.length() != minLen) rem.add(x);
        }
        for(String x:rem) beauty.remove(x);
        Collections.sort(beauty);
        return (beauty.size()>0)?beauty.get(0):"";
    }
}