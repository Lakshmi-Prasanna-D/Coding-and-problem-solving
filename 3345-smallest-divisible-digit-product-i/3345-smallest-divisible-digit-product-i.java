class Solution {
    public int smallestNumber(int n, int t) {
        int x=n+t;
        for(int i=n;i<=x;i++){
            int prod=1;
            int temp=i;
            while(temp!=0){
                int z=temp%10;
                prod*=z;
                temp/=10;
            }
            if(prod%t==0) return i;
        }
        return -1;
    }
}