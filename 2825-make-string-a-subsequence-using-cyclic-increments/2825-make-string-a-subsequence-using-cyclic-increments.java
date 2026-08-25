class Solution {
    public boolean canMakeSubsequence(String s, String t) {
        int n1=s.length();
        int n2=t.length();
        int i=0,j=0;
       if(n1==1 && n2==1){
        if(s.charAt(0)=='z' && t.charAt(0)=='a') return true;
       }
         while(i<n1 && j<n2){
            if(s.charAt(i)==t.charAt(j)){
                i++;
                j++;
            }
            else if(s.charAt(i)=='z' && t.charAt(j)=='a' || s.charAt(i)-'a'+1 == t.charAt(j)-'a'){
                i++;
                j++;
            }
            else
             i++;
         }
         if(j==n2 && (s.charAt(i-1)==t.charAt(j-1)|| s.charAt(i-1)-'a'+1 == t.charAt(j-1)-'a' || s.charAt(i-1)=='z' && t.charAt(j-1)=='a')) return true;
        
         return false;



    }
}