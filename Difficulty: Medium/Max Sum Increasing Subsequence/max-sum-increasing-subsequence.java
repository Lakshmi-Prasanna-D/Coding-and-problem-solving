class Solution {
    public int maxSumIS(int arr[]) {
        // code here
        int n=arr.length;
        int sum=0;
        int prev;
        int dp[][]=new int[n][n+1];
        for(int i=0;i<n;i++)
          Arrays.fill(dp[i],-1);
        int res=f(arr,n-1, prev=n,dp);
       if(res<0) return 0;
        return res;
    }
    int f(int arr[] ,int n ,int prev,int dp[][]){
        if(n==0){
            if( prev==arr.length || arr[n]<arr[prev])
              return arr[n];
            return 0;
        }
        if(dp[n][prev]!=-1) return dp[n][prev];
        int pick=Integer.MIN_VALUE;
        if(prev==arr.length || arr[n]<arr[prev])
          pick=arr[n]+f(arr,n-1,n,dp);
        int nopick=f(arr,n-1 ,prev,dp);
    return dp[n][prev] = Math.max(pick,nopick);
    }
}