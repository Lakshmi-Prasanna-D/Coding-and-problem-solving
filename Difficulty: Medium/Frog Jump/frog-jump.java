class Solution {
    int minCost(int[] height) {
        // code here
        int n=height.length;
        int dp[]=new int[n];
        Arrays.fill(dp,-1);
        return f(height,n-1, dp);
    }
    
    int f(int height[] , int i,int []dp ){
        if(i==0) return 0;
        if(dp[i]!=-1) return dp[i];
        
      
         int j1=Math.abs(height[i]-height[i-1])+f(height, i-1, dp);
         int j2=Integer.MAX_VALUE;
         if(i>1)
           j2=Math.abs(height[i]-height[i-2])+f(height,i-2,dp);
        
        return dp[i]=Math.min(j1,j2);
        
    }
}
         