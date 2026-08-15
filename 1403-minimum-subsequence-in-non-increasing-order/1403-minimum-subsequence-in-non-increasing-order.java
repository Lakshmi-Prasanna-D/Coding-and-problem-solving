class Solution {
    public List<Integer> minSubsequence(int[] nums) {
        Arrays.sort(nums);
        int sum=0;
        for(int x:nums)
          sum+=x;

    int temp=0;
     int n=nums.length;
     int ind=n;
     for(int i=n-1;i>=0;i--)
     {
         sum-=nums[i];
        temp+=nums[i];
        if(temp>sum)
            {
                ind=i;
                break;
            }
       
     }
    ArrayList<Integer> res=new ArrayList<>();
     for(int i=n-1 ;i>=ind ;i--){
         res.add(nums[i]);
     }
return res;

    }
}