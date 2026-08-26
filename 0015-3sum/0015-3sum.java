class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>> st=new HashSet<>();
        int n=nums.length;
        Arrays.sort(nums);
        for(int i=0;i<n-2;i++){
            if(i>0 && nums[i]==nums[i-1]) continue;
            int j=i+1,k=n-1;
            while(j<k){
                int sum=nums[i]+nums[j]+nums[k];
                if(sum>0) k--;
                else if(sum<0) j++;
                else{
                    List<Integer> ls =new ArrayList<>();
                    ls.add(nums[i]);
                    ls.add(nums[j]);
                    ls.add(nums[k]);
                    st.add(ls);
                    j++;k--;
                    while(j<k && nums[j]==nums[j-1]) j++;
                    while(j<k && nums[k]==nums[k+1]) k--;
                }
            }
        }
        List<List<Integer>> ans=new ArrayList<>();
        for(List<Integer> x:st) ans.add(x);
        return ans;
    }
}