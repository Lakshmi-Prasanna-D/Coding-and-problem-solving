class Solution {
    public int minMoves2(int[] nums) {
        int moves=0;
        Arrays.sort(nums);
        int mid=nums[nums.length/2];
        for(int x:nums){
            moves+=Math.abs(mid-x);
        }
        return moves;
    }
}