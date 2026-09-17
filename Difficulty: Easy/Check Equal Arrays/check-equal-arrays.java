class Solution {
    public static boolean checkEqual(int[] a, int[] b) {
        // code here
        HashMap<Integer,Integer> hm1=new HashMap<>();
        for(int x: a){
            hm1.put(x,hm1.getOrDefault(x,0)+1);
        }
        HashMap<Integer,Integer> hm2=new HashMap<>();
        for(int x: b){
            hm2.put(x,hm2.getOrDefault(x,0)+1);
        }
        return hm1.equals(hm2);
    }
}