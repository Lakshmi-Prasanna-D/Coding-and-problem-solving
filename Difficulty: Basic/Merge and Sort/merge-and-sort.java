class Solution {
    public ArrayList<Integer> mergeNsort(int[] arr1, int[] arr2) {
        // code here
        int l1=arr1.length;
        int l2=arr2.length;
        int n=l1+l2;
        int arr[] =new int[n];
        int k=0;
        for(int i=0;i<l1 ;i++){
            arr[k++]=arr1[i];
        }
        for(int i=0;i<l2;i++){
            arr[k++] = arr2[i];
        }
        Arrays.sort(arr);

        ArrayList<Integer> res=new ArrayList<>();
                res.add(arr[0]);
        for(int i=1;i< n ;i++){
            if(arr[i-1]!=arr[i]) res.add(arr[i]);
        }
        return res;
    }
}
