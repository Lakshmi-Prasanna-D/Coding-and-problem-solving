class Solution {
    int missingNum(int arr[]) {
        // code here
        int xor=0;
        int n=arr.length+1;
        for(int i=1;i<=n;i++){
            xor^=i;
        }
        for(int x:arr){
            xor^=x;
        }
        return xor;
    }
}