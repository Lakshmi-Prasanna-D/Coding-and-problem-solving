class Solution {
    public int longestMonotonicSubarray(int[] nums) {
        int n=nums.length;
        int l=0,r=1;
        int res=0;
        while(r<n){
            if(nums[r]<=nums[r-1]){
               res=Math.max(res,r-l);
               l=r;}
               r++;
        }
        res=Math.max(res,r-l);
        int res1=0;
        r=1;l=0;
         while(r<n){
            if(nums[r]>=nums[r-1]){
               res1=Math.max(res1,r-l);
               l=r;}
               r++;
        }
        res1=Math.max(res1,r-l);
       return Math.max(res,res1);
    }
}