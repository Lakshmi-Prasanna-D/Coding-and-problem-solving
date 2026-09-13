class Solution {
    public static int findSum(String s) {
        // code here
        int sum=0;
        int i=0;
        int n=s.length();
        while(i<n){
            String temp="";
            while(i<n && Character.isDigit(s.charAt(i))){
                temp+=s.charAt(i);
                i++;
            }
            if(temp.length()>0) 
               sum+=Integer.parseInt(temp);
            while(i<n && !Character.isDigit(s.charAt(i))) i++;
            
        }
        return sum;
    }
}