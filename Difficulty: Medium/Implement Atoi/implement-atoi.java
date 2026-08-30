class Solution {
    public int myAtoi(String s) {
        // code here
        //long res;
       long num=0;
       s=s.trim();
       int sign=1;
       int ind=0;
      if(s.charAt(0)=='-') {
          sign=-1;
          ind++;
      }
      else if(s.charAt(0)=='+') ind++;
      
      for(int i=ind;i<s.length();i++){
          if(Character.isDigit(s.charAt(i)))
          num=(num*10)+ (s.charAt(i)-'0');
          else break;
      }
     if(sign*num>Integer.MAX_VALUE) return Integer.MAX_VALUE;
    else if(sign*num <Integer.MIN_VALUE) return Integer.MIN_VALUE;
    return (int) (sign*num);
    }
}