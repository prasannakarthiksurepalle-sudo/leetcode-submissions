class Solution {
    public int majorityElement(int[] nums) {
        int n=nums.length;
        int el=nums[0],freq=0;
        for(int x:nums){
            if(freq==0){
                el=x;
            }
            if(x==el) freq++;
            else freq--;
        }
        return el;
    }
}