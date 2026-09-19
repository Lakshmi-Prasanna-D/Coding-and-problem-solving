class Solution {
    public ArrayList<ArrayList<Integer>> freqSorted(ArrayList<Integer> arr) {
        // code here
        TreeMap<Integer,Integer> hm=new TreeMap<>();
        for(int x: arr){
            hm.put(x , hm.getOrDefault(x,0)+1);
        }
        ArrayList<ArrayList<Integer>> res=new ArrayList<>();
        for(int x: hm.keySet()){
            ArrayList<Integer> al=new ArrayList<>();
            al.add(x);
            al.add(hm.get(x));
            res.add(al);
        }
        return res;
    }
}