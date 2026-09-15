class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int n=matrix.length;
        int m=matrix[0].length;
        for(int i=0;i<n;i++){
            int l=0,r=m-1;
            if(matrix[i][l]==target || matrix[i][r]==target)
                return true;
            if(matrix[i][l]<target && matrix[i][r]>target)
            {
                for(int j=l;j<=r;j++)
                {
                    if(matrix[i][j]==target)
                       return true;
                }
               
            }
            else if(target>matrix[i][r])
              continue;
            
        }
        return false;
    }
}