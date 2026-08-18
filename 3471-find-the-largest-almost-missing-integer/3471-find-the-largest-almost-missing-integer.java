class Solution {
    public int largestInteger(int[] nums, int k) {
        int n=nums.length;
        int[] freq=new int[51];
        int mx=Integer.MIN_VALUE;
        for(int x:nums){
            freq[x]++;
            mx=Math.max(mx,x);
        }
        int first=nums[0];
        int last=nums[n-1];
        if(k==1){
            for(int i=50;i>=0;i--){
                if(freq[i]==1) return i;
            }
        }
        if(k==n){
            return mx;
        }
        if(freq[first]==1 && freq[last]==1) return Math.max(first,last);
        if(freq[first]==1) return first;
        if(freq[last]==1) return last;
        return -1; 
    }
}