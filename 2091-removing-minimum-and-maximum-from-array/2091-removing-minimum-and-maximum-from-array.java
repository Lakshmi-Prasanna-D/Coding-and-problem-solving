class Solution {
    public int minimumDeletions(int[] nums) {
        int n=nums.length;
        if(n==1) return 1;
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        int maxind=-1;
        int minind=-1;
        for(int i=0;i<n;i++){
            if(nums[i]>max){
                max=nums[i];
                maxind=i;
            }
            if(nums[i]<min){
                min=nums[i];
                minind=i;
            }
        }
        int d1=n-Math.min(maxind,minind);
        int d2=Math.max(minind,maxind)+1;
        int d3 = (Math.min(minind, maxind) + 1)
         + (n - Math.max(minind, maxind));
        return Math.min(d1,Math.min(d2,d3));
        
    }
}