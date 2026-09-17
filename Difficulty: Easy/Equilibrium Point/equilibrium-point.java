class Solution {
    // Function to find equilibrium point in the array.
    public static int findEquilibrium(int arr[]) {
        // code here
        int n=arr.length;
        int sum=0;
        int s1=0;
        for(int x:arr)
           sum+=x;
     // sum=sum-arr[0];
        for(int i=0;i<n;i++){
           s1+=arr[i];

           if(s1==sum )
           {

             return i;
          }

           sum-=arr[i];
       }
       return -1;
    }
}