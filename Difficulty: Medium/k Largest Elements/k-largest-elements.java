class Solution {
    public ArrayList<Integer> kLargest(int[] arr, int k) {
        // code here
        Arrays.sort(arr);
        int n=arr.length;
        ArrayList<Integer> res=new ArrayList<>();
        res.add(arr[n-1]);
        if(k==1) return res;
        for(int i=n-2;i>=n-k ;i--){
            res.add(arr[i]);
        }
        return res;
        
    }
}
