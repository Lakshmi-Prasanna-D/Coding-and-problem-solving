class Solution {
    public int getSecondLargest(int[] arr) {
        // code here
        int max=Integer.MIN_VALUE;
        int secmax=Integer.MIN_VALUE;
        
        for(int x:arr){
            if(x>max){
                if(max!=secmax)
                   secmax=max;
                max=x;
            }
            else{
                if(x!=max)
              secmax=Math.max(secmax,x);
            }
        }
        if(secmax==Integer.MIN_VALUE) return -1;
        return secmax;
    }
}