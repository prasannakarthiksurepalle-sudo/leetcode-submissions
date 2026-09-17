class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> st=new HashSet<>();
        for(int x:nums) st.add(x);
        int ans=0;
        int n=nums.length;
        for(int i=0;i<n;i++){
            if(st.contains(nums[i])){
                int tmp1=nums[i];
                int tmp2=nums[i]+1;
                int c1=0;
                int c2=0;
                while(st.contains(tmp1)){
                    c1++;
                    st.remove(tmp1);
                    tmp1--;
                }
                while(st.contains(tmp2)){
                    c2++;
                    st.remove(tmp2);
                    tmp2++;
                }
                ans=Math.max(ans,c1+c2);
            }
        }
        return ans;
    }
}