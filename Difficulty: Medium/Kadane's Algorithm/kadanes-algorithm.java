class Solution {
    int maxSubarraySum(int[] arr) {
        // Code here
        int max1=0;
        int max2=arr[0];
        for(int x: arr){
         
           if(max1<0)
             max1=x;
           else
             max1+=x;
               max2=Math.max(max1,max2);
            
        }
        return Math.max(max1,max2);
    }
}
