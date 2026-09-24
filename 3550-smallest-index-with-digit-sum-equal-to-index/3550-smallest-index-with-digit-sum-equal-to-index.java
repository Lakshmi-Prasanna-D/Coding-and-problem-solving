class Solution {
    public int smallestIndex(int[] nums) {
        int sum=0;
        int n=nums.length;
        for(int i=0; i< n ;i++){
            int x=nums[i];
            if(isequal(x , i)) return i;
        }
        return -1;
    }
boolean isequal(int x , int i) {
    int sum=0;
    while(x!=0){
        int t=x%10;
        sum+=t;
        x=x/10;
    }
    return sum==i;
}
}