class Solution {
    static ArrayList<Integer> removeDuplicate(int arr[]) {
        // code here
        ArrayList<Integer> al=new ArrayList<>();
        HashSet<Integer> hs=new HashSet<>();
        for(int x:arr){
            if(!hs.contains(x)) 
               al.add(x);
            hs.add(x);
        }
        return al;
    }
}