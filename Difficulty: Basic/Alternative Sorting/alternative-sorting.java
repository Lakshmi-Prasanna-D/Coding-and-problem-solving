class Solution {
    public static ArrayList<Integer> alternateSort(int[] arr) {
        // code here
        ArrayList<Integer> res=new ArrayList<>();
        int n=arr.length;
        Arrays.sort(arr);
        n--;
        int i=0;
        while(i<n){
            res.add(arr[n--]);
            res.add(arr[i++]);
        }
        if(res.size()<arr.length)
           res.add(arr[n]);
        return res;
    }
}
