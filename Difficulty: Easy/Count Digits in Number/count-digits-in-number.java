class Solution {
    public static int countDigits(int n) {
        // Code here
        return f(n);
    }
   static int f(int n){
        if(n<10) return 1;
        else
          return 1+ f(n/10);
    }
}
