class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>> st=new HashSet<>();
        int n=nums.length;
        for(int i=0;i<n-2;i++){
            Set<Integer> set=new HashSet<>();
            for(int j=i+1;j<n;j++){
                int find= -(nums[i]+nums[j]);
                if(set.contains(find)){
                    List<Integer> ls=new ArrayList<>();
                    ls.add(nums[i]);
                    ls.add(nums[j]);
                    ls.add(find);
                    Collections.sort(ls);
                    st.add(ls);
                }
                set.add(nums[j]);
            }
        }
        List<List<Integer>> ans=new ArrayList<>();
        for(List<Integer> x:st) ans.add(x);
        return ans;
    }
}