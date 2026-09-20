class Solution {
    public ArrayList<Integer> subsetSums(int[] arr) {
        // code here
        ArrayList<Integer> res=new ArrayList<>();
        res.add(0);
        int n=arr.length;
        f(arr, 0 , n , res , 0);
        return res;
    }
    void f(int arr[] , int  i ,int n , ArrayList<Integer> res , int sum){
        if(i==n) return ;
       int x=sum+ arr[i];
       res.add(x);
       f(arr, i+1, n , res, x);
       f(arr , i+1 ,  n , res,sum);
    }
}