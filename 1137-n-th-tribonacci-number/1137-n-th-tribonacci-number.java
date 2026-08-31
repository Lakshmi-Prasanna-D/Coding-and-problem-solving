class Solution {
    public int tribonacci(int n) {
        int a=0;
       int  b=1;
       int  c=1;
        if(n==0) return 0;
        if(n==1) return 1;
        if(n==2) return 1;
        if(n==3) return 2;
        int res=a+b+c;
        for(int i=3;i<n;i++){
            a=b;
            b=c;
            c=res;
            res=a+b+c;
        } return res;
    }
}