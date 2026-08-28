class Solution {
    public int removeDuplicates(int[] nums) {
        int n=nums.length;
       int i=0,j=i+1;
       int temp=n;
       while(j<n)
       {
       
         if(nums[i]!=nums[j]){
            i++;
            nums[i]=nums[j];
       
           
         }
        j++;
       }
        return i+1;
    }
}