class Solution {
    public boolean isSubSeq(String s1, String s2) {
        // code here
        int n1=s1.length();
        int n2=s2.length();
        int j=0;
        for(int i=0 ; i< n2 ;i++){
            if(j==n1) return true;
            if(j <n1 && s1.charAt(j)==s2.charAt(i)){
                j++;
                
            }
            else
             continue;
        }
        return j==n1;
    }
};