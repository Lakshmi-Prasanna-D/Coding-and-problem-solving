class Solution {
    public void moveZeroes(int[] nums) {
        int n=nums.length;
        int i=0,j=0;
        while(i<n && j<n){
            if(nums[i]==0){
                while(j<n && nums[j]==0)j++;
                if(i<j && j<n)
                  swap(nums,i,j);
            }
            i++;j++;
        }
       // return nums;
    }
    void swap(int a[] ,int i , int j){
        int t=a[i];
        a[i]=a[j];
        a[j]=t;
    }
}