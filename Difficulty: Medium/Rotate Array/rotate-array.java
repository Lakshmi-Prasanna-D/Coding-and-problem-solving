class Solution {
    public void rotateArr(int arr[], int d) {
        // code here
        ArrayList<Integer> al=new ArrayList<>();
        int n=arr.length;
        for(int x: arr)
           al.add(x);
        d=d%n;
        int j=0;
        
        for(int i=d;i<n;i++){
            arr[j]=al.get(i);
            j++;
        }
      int  k=0;
        for(int i=j;i<n && k<d;i++){
            arr[i]=al.get(k);
            k++;
        }
    }
}