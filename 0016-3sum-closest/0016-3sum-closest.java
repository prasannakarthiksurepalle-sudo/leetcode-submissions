class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int n=nums.length;
        int ans=Integer.MIN_VALUE;
        int diff=Integer.MAX_VALUE;
        for(int i=0;i<n-2;i++){
            for(int j=i+1;j<n-1;j++){
                for(int k=j+1;k<n;k++){
                    int sum=nums[i]+nums[j]+nums[k];
                    int curdiff=Math.abs(sum-target);
                    if(curdiff<diff){
                        diff=curdiff;
                        ans=sum;
                    }
                }
            }
        }
        return ans;
    }
}