class Solution {
    public int subarraySum(int[] nums, int k) {
        Map<Integer,Integer> mp=new HashMap<>();
        mp.put(0,1);
        int n=nums.length;
        int ans=0;
        int runSum=0;
        for(int i=0;i<n;i++){
            runSum+=nums[i];
            if(mp.containsKey(runSum-k)){
                ans+=mp.get(runSum-k);
            } mp.put(runSum,mp.getOrDefault(runSum,0)+1);
        }
        return ans;
    }
}