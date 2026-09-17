class Solution {
    public int subarraySum(int[] nums, int k) {
        Map<Integer,Integer> mp=new HashMap<>();
        mp.put(0,1);
        int n=nums.length;
        int ans=0;
        int[] pf=new int[n];
        pf[0]=nums[0];
        for(int i=1;i<n;i++) pf[i]=pf[i-1]+nums[i];
        for(int i=0;i<n;i++){
            if(mp.containsKey(pf[i]-k)){
                ans+=mp.get(pf[i]-k);
            } mp.put(pf[i],mp.getOrDefault(pf[i],0)+1);
        }
        return ans;
    }
}