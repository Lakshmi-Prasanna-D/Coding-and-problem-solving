class Solution {
    public boolean canPartition(int[] nums) {
        int n=nums.length;
      
        int sum=0;
        for(int x:nums) sum+=x;
        if(sum%2!=0)return false;
        int target=sum/2;
          Boolean dp[][]=new Boolean[n][sum+1];
      boolean res=  f(nums, 0 , target,dp);
        return res;
        
    }
    boolean f(int nums[] , int i , int sum ,Boolean dp[][]){
        if(sum==0)return true;
  if(i==nums.length) return sum==0;
  if(dp[i][sum]!=null)return dp[i][sum];
  boolean pick=false;
  if(nums[i]<=sum){
    pick=f(nums, i +1 ,sum-nums[i],dp);
  }
  boolean nopick=f(nums, i+1 ,sum,dp);
  return dp[i][sum]= pick|| nopick;
    }
}