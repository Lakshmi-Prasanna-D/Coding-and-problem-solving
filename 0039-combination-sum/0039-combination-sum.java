class Solution {
    public List<List<Integer>> combinationSum(int[] nums, int target) {
       List<List<Integer>> res=new ArrayList<>();
       List<Integer> al=new ArrayList<>();
       f(nums,target,res,al,0);
       return res;
    }
    void f(int nums[] ,int target,List<List<Integer>> res,List<Integer> al,int i){
        if(target==0){
           res.add(new ArrayList<>(al));
           return ;
         }
         if(i==nums.length) return ;
         if(nums[i]<=target){
            al.add(nums[i]);
            f(nums,target-nums[i], res,al,i);
            al.remove(al.size()-1);
         }
         f(nums,target,res,al,i+1);
    }
}