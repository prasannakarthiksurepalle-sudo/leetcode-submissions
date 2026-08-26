class Solution {
    public String shortestBeautifulSubstring(String s, int k) {
        int left=0;
        int n=s.length();
        String ans="";
        int ones=0;
        for(int right=0;right<n;right++){
            if(s.charAt(right)=='1') ones++;
            if(ones==k){
                while(s.charAt(left)=='0') left++;
                String res=s.substring(left,right+1);
                if(ans.isEmpty() || res.length()<ans.length() || (res.length()==ans.length() && ans.compareTo(res) > 0 )) ans=res;

                left++;
                ones--;  
            }
        }
        return ans;
    }
}