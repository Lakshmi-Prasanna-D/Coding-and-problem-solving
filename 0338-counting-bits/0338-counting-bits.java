class Solution {
    public int[] countBits(int n) {
       int res[]=new int[n+1];
       for(int i=0;i<=n;i++){
        int t=i;
        int x=0;
        while(t!=0){
            x+=(t%2);
            t=t/2;
        }
        res[i]=x;
       }
       return res;
    }
}