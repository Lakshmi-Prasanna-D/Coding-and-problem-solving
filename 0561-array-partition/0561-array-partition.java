class Solution {
    public int arrayPairSum(int[] nums) {
       Arrays.sort(nums);
       int n=nums.length;
       int sum=0;
       for(int i=0;i<n;i+=2){
        int x1= nums[i];
       int x2=nums[i+1];
       sum+=Math.min(x1,x2);
       }
       return sum;
    }
}