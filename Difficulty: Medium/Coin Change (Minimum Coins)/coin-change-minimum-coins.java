class Solution {
    public int minCoins(int coins[], int sum) {
        // code here
        int n=coins.length;
        int dp[][]=new int[n][sum+1];
      for(int i=0;i<n;i++)
        Arrays.fill(dp[i],-1);
        int res=f(coins,sum,n-1,dp);
        if(res==(int)1e9) return -1;
        return res;
    }
    int f(int coins[] ,int sum, int n,int dp[][]){
        if(n==0){
            if(sum%coins[0]==0)
             return sum/coins[0];
        return (int)1e9;
        }
        if(dp[n][sum]!=-1) return dp[n][sum];
       // if(sum==0) return 0;
        int pick=(int)1e9;
        if(coins[n]<=sum)
        {
          pick=1+f(coins,sum-coins[n],n,dp);
        }
        int nopick=f(coins,sum,n-1,dp);
    return dp[n][sum]=Math.min(pick,nopick);
    }
}