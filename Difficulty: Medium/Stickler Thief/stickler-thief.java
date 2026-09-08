class Solution {
    public int findMaxSum(int arr[]) {
        // code here
        int n=arr.length;
        int dp[]=new int[n];
        Arrays.fill(dp,-1);
        return f(arr,0,n,dp);
    }
    int f(int nums[] , int i , int n,int dp[]){
        if(i>=n) return 0;
        if(dp[i]!=-1) return dp[i];
        int pick=Integer.MIN_VALUE;
        pick=nums[i]+f(nums, i+2, n,dp);
        int nopick=f(nums,i+1,n,dp);
       return dp[i]= Math.max(pick,nopick);
    }
}