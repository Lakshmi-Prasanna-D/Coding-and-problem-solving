class Solution {
    public boolean canAliceWin(int n) {
        int x=10;
        boolean res=false;
        while(n>=x){
             n-=x;
             x--;
             res=!res;
        }
        return res;
    }
}