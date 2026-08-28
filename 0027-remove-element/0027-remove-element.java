class Solution {
    public int removeElement(int[] nums, int val) {
        int n=nums.length;
        ArrayList<Integer> al=new ArrayList<>();
        for(int x:nums){
            if(x!=val)
               al.add(x);
        }
        for(int i=0;i<al.size();i++){
            nums[i]=al.get(i);
        }
        return al.size();
    }
}