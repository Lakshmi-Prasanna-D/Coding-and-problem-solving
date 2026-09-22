class Solution {
    public void arrange(int[] arr) {
        // code here
        int n=arr.length;
        int temp[]= Arrays.copyOf(arr,n);
   
        for(int i=0;i<n;i++){
            arr[i]=temp[temp[i]];
        }
        
    }
}