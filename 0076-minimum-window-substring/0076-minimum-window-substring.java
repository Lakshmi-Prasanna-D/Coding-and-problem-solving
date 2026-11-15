class Solution {
    public String minWindow(String s, String t) {
        int n=s.length();
        int m=t.length();
        HashMap<Character,Integer> hm=new HashMap<>();
        for(char ch:t.toCharArray())
           hm.put(ch,hm.getOrDefault(ch,0)+1);
           
        int l=0 ,r=0;
        int c=0;
        int start=-1;
        int minlen=Integer.MAX_VALUE;
        while(r<n){
            char ch=s.charAt(r);
         if(hm.containsKey(ch)){
           if(hm.get(ch)>0) c++;
            hm.put(ch,hm.get(ch)-1);

         }
         else {
            hm.put(ch, hm.getOrDefault(ch, 0) - 1);
         }
         while(c==m){
              if (r - l + 1 < minlen) {
                    minlen = r - l + 1;
                    start = l;
                }
            char v= s.charAt(l);
            if (hm.containsKey(v)) {
                    hm.put(v, hm.get(v) + 1);

                    if (hm.get(v) > 0)
                        c--;
                }
            
            l++;
         }
         r++;
         

        }
        if(start==-1)return "";
        return s.substring(start,start+minlen);
}

}