class Solution {
    public long[] findElements(long arr[]) {
        // code 
        Arrays.sort(arr);
        int n=arr.length;
         long res[]=new long[n-2];
         for(int i=0;i<n-2;i++){
             res[i]=arr[i];
         }
         return res;
    }
}