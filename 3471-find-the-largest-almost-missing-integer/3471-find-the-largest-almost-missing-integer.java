class Solution {
    public int largestInteger(int[] nums, int k) {
     //   int max=nums[0];
        int c=nums[0];

      int n=nums.length;;
        if(k==1)
        {
            HashMap<Integer,Integer> hm=new HashMap<>();
            for(int x:nums){
                hm.put(x,hm.getOrDefault(x,0)+1);
                }
            int max=-1;
            for(int x:nums){
                if(x>max && hm.get(x)==1)
                   max=x;
            }
            return max;
        }
    
        
        int max1=1;
        int max2=1;
        int res=nums[0];
        for(int i=1;i<n-1;i++){
            res=Math.max(res,nums[i]);
            if(nums[i]==nums[0])
               max1++;
            if(nums[i]==nums[n-1])
              max2++;
        }
        res=Math.max(res,nums[n-1]);
        if(k==n) return res;
        if(nums[0]!=nums[n-1] && k>1){
        if(max1==1 && max2==1 )
           return Math.max(nums[0],nums[n-1]);
        else if(max1==1  )
            return nums[0];
        else if(max2==1) return nums[n-1];
        }
     
        return -1;
    }
}