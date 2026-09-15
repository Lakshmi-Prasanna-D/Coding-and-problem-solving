class Solution {
    public void quickSort(int[] arr, int low, int high) {
        // code here
        if(low<high){
            int p=partition(arr, low , high);
            quickSort(arr,low , p-1);
            quickSort(arr, p+1 , high);
        }
    }

    private int partition(int[] arr, int low, int high) {
        // code here
        int l=low+1;int h=high;
        int pivot=low;
        while(l<=h){
            while(l<=high && arr[l]<=arr[pivot]  ){
                l++;
            }
            while(h>=low && arr[h]>arr[pivot] )
              h--;
              if(l<h)
                 swap(arr,l,h);
             
            
        }
        swap(arr,h,pivot);
        return h;
    }
    void swap(int arr[] ,int i ,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
}