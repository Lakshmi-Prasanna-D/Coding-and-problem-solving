class Solution {
    public int maxProfit(int[] prices) {
        int n=prices.length;
        int res=0;
        int sell=0,buy=1001;
        int dp[][]=new int[n][n];
        for(int i=0;i<n;i++)
           Arrays.fill(dp[i],-1);
        res=f(0,prices,0,n,dp);
        return res;
    }
    int f(int i,int prices[],int buy , int n,int dp[][]){
        if(i>=n || buy>=n)
           return 0;
      if(dp[i][buy]!=-1) return dp[i][buy] ; 

        int x=1001;
        if(prices[buy]>prices[i])
        {
            x=prices[i];
            buy=i;
        }
        else
          x=prices[buy];
        int pick=Integer.MIN_VALUE;
        if(x<prices[i])
        {
            pick=(prices[i]-x)+f(i+2,prices,i+2,n,dp);
        }
        int nopick=f(i+1, prices,buy,n,dp);
        return dp[i][buy]=Math.max(pick,nopick);
    }
}