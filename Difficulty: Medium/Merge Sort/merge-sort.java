class Solution {
    public void mergeSort(int arr[], int l, int r) {
        // code here
        if(l<r){
            int m=(l+r)/2;
            mergeSort(arr,l,m);
            mergeSort(arr,m+1,r);
            merge(arr,l,m,r);
            
        }
    }
  void merge(int arr[] ,int l ,int m ,int h){
      int a[]=new int[h-l+1];
      int left=l;
      int right=m+1;
      int i=0;
      while(left<=m && right<=h){
          if(arr[left]<arr[right]){
              a[i++]=arr[left++];
             // left++;
          }
          else
           {
               a[i++]=arr[right++];
           }
      }
      while(left<=m){
          a[i++]=arr[left++];
      }
      while(right<=h){
          a[i++]=arr[right++];
      }
      for(int k=l;k<=h;k++){
          arr[k]=a[k-l];
      }
  }
}