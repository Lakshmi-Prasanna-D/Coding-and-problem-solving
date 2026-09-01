class Solution {
    public int uniquePaths(int m, int n) {
        int[]dp=new int[n];
        Arrays.fill(dp,1);
        for(int i=1;i<m;i++){
            int w=0;
            for(int j=0;j<n;j++){
                if(j==0)
                  w=1;
                else
                   w=w+dp[j];
                dp[j]=w;
            }
        }
        return dp[n-1];
    }
}