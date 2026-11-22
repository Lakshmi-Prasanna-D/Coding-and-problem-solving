class Solution {
    public boolean checkString(String s) {
        if(s.length()<=1)return true;
       
      int i=0;
      int n=s.length();
      while(i<n && s.charAt(i)=='a'){
         i++;
      }
      while(i<n && s.charAt(i)=='b')
        i++;
        return i==n;
    }
}