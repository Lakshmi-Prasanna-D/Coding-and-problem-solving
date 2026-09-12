import java.lang.*;
class Solution {
    public static boolean areAnagrams(String s1, String s2) {
        // code here
        if(s1.length() !=s2.length())  return false;
        int a[]=new int[26];
        int b[]=new int [26];
        for(char ch:s1.toCharArray())
          a[ch-'a']++;
        for(char ch : s2.toCharArray())
           b[ch-'a']++;
        return Arrays.equals(a,b);
    }
}