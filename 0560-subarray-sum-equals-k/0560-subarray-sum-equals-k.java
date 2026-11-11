class Solution {
    public int subarraySum(int[] arr, int k) {
        int c=0;
        int sum=0;
        int n=arr.length;
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int i=0;i<n;i++)
        {
            sum+=arr[i];
            if(sum==k)
            {
                c++;
                
            }
           if(hm.containsKey(sum-k))
              c+=hm.get(sum-k);
            hm.put(sum,hm.getOrDefault(sum,0)+1);
        
        }
        return c;
    }
}