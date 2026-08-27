class Solution {
    public int missingMultiple(int[] nums, int k) {
        HashSet<Integer> hs=new HashSet<>();
        for(int x:nums) hs.add(x);
        int temp =k;
        while(hs.contains(temp)){
            temp+=k;
        }
        return temp;
    }
}