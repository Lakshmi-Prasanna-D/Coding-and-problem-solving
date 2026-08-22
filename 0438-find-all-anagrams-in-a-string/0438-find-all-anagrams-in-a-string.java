import java.util.*;

class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        int[] countP = new int[26];
        int[] window = new int[26];

        for (char c : p.toCharArray()) {
            countP[c - 'a']++;
        }

        List<Integer> res = new ArrayList<>();
        int k = p.length();

        for (int i = 0; i < s.length(); i++) {
            window[s.charAt(i) - 'a']++;

            if (i >= k) {
                window[s.charAt(i - k) - 'a']--;
            }

            if (Arrays.equals(countP, window)) {
                res.add(i - k + 1);
            }
        }

        return res;
    }
}