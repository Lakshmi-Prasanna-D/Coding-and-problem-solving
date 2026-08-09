class Solution {
    public int zigzagSequence(int[][] mat) {
        // code here
        int n=mat.length;
        int dp[][]=new int [n][n];
        for(int i=0;i<n;i++)
          Arrays.fill(dp[i],-1);
        int res=0;
        for(int i=0;i<n;i++){
            res=Math.max(res,f(mat,0,i,n,dp));
        }
        return res;
    }
    int f(int mat[][] ,int i,int j , int n,int[][] dp){
        if(i==n || j==n || j<0 || i<0) return Integer.MIN_VALUE;
        if(i==n-1) return mat[i][j];
        if(dp[i][j]!=-1) return dp[i][j];
    int pick=Integer.MIN_VALUE;
    
        for(int k=0;k<n;k++){
            if(j!=k){
                pick=Math.max(pick, mat[i][j]+f(mat,i+1,k,n,dp));
            }
           
    }
      return dp[i][j]=
      pick;
    }
}