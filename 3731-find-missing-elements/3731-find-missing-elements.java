class Solution {
    public List<Integer> findMissingElements(int[] nums) {
       HashSet<Integer> hs=new HashSet<>();
       int min=Integer.MAX_VALUE;int max=-1;
       for(int x: nums){
         hs.add(x);
         min=Math.min(x,min);
         max=Math.max(max,x);
       }
       ArrayList<Integer> res=new ArrayList<>();
       while(min<max){
        min++;
        if(!hs.contains(min))
          res.add(min);
       }
       return res;
    }
}