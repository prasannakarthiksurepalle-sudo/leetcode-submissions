class Solution {
    public int majorityElement(int[] nums) {
        Map<Integer,Integer> mp=new HashMap<>();
        for(int x:nums){
            mp.put(x,mp.getOrDefault(x,0)+1);
        }
        int n=nums.length;
        int ans=-1;
        for(int x:mp.keySet()){
            int key=x;
            int val=mp.get(x);
            if(val>(n/2)){
                ans=key;
            }
        }
        return ans;
    }
}