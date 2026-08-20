class Solution {
    public int subarraySum(int[] nums, int k) {
     int sum=0;
     HashMap<Integer,Integer> hm=new HashMap<>();
     hm.put(0,1);
     int res=0;
     for(int x:nums){
        sum+=x;
        if(hm.containsKey(sum-k))
          res+=hm.get(sum-k);
           hm.put(sum,hm.getOrDefault(sum,0)+1);
        
     }
     return res;
    }
}