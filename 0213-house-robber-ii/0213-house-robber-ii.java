class Solution {
    public int rob(int[] nums) {
        int n=nums.length;
        if(n==1) return nums[0];
        if(n==2) return Math.max(nums[0],nums[1]);
      int dp[]=new int[n];
      Arrays.fill(dp,-1);
      int res=f(nums,0,n-2,dp);
       Arrays.fill(dp,-1);
      int res2=f(nums,1,n-1,dp);
      return Math.max(res,res2);
    }
    int f(int nums[] ,int i ,int n,int dp[]){
        if(i>n) return 0;
        if(i==n) return nums[i];
        if(dp[i]!=-1) return dp[i];
        int pick=Integer.MIN_VALUE;

        pick=nums[i]+f(nums,i+2,n, dp);
        int nopick=f(nums,i+1,n,dp);
        return dp[i]=Math.max(pick,nopick);
    }
}