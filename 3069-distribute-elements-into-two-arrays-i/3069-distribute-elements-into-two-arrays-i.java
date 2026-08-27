class Solution {
    public int[] resultArray(int[] nums) {
        int n=nums.length;
        ArrayList<Integer> a=new ArrayList<>();
        ArrayList<Integer> b=new ArrayList<>();
        int l=0,m=0;
        for(int i=0;i<n;i++){
           if(l==0){
            a.add(nums[i]);
            l++;
           }
           else if(m!=0 && a.getLast()>b.getLast()){
              a.add(nums[i]);
              l++;}
            else {
              b.add(nums[i]);
              m++;}
        }
        a.addAll(b);
        return a.stream()
                  .mapToInt(Integer::intValue)
                  .toArray();
    }
}