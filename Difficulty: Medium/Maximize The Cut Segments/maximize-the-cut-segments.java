class Solution {
    public int maximizeCuts(int n, int x, int y, int z) {
        // code here
        int a[]=new int[3];
      int res=0;
      a[0]=x;
      a[1]=y;
      a[2]=z;
      int l=2;
    res=f(l,n,a);
    if(res<=-1) return 0;
    return res;
    }
    
int f(int n ,int sum ,int a[]){
     if(sum==0) return 0;
    if(n==0)
    {
        if(sum%a[0]==0)
           return sum/a[n];
        return -(int)1e9 ;
            
    }
   
    int pick=-(int)1e9;int nopick=-(int)1e9;
    if(a[n]<=sum)
      pick=1+f(n,sum-a[n],a);
   nopick=f(n-1,sum,a);
    return Math.max(pick,nopick);
}
}
