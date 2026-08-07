class Solution {
    int minCost(int[] arr) {
        // code here
       int n=arr.length; 
       int dp[]=new int[n];
       for(int i=1;i<n;i++){
           if(i==1)
             dp[i]=Math.abs(arr[i]-arr[0]+dp[i-1]);
            else{
                int d1=dp[i-1]+Math.abs(arr[i]-arr[i-1]);
                int d2=dp[i-2]+Math.abs(arr[i]-arr[i-2]);
                dp[i]=Math.min(d1,d2);
            }
       }
       return dp[n-1];
    }
}