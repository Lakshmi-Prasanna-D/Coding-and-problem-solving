class Solution {
    public int majorityElement(int[] nums) {
        int n=nums.length;
        int res=-1;
        int m=n/2;
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int x:nums){
            hm.put(x,hm.getOrDefault(x,0)+1);
        }
        for(int x:nums){
            if(hm.get(x)>m)
               res=x;
        }
        return res;
    }
}