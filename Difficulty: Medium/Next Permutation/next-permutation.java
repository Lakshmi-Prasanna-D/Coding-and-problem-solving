class Solution {
    void nextPermutation(int[] arr) {
        // code here
        int n=arr.length;
        int min=-1;
        int ind=-1;
        for(int i=n-2;i>=0;i--){
            if(arr[i]<arr[i+1])  
            {
                min=arr[i];
                ind=i;
                break;
            }
        }
        if(ind==-1) 
        {reverse(arr,n-1,0);
        return ;
        }
        else{
        min=ind+1;
        for(int i =ind+1;i<n;i++){
            if(arr[ind]<arr[i] &&  arr[min]>=arr[i])
            {
                min=i;
            }
        }
        int t=arr[ind];
        arr[ind]=arr[min];
        arr[min]=t;
        ind++;
    //    int j=n-1;
        reverse(arr,n-1,ind);
        }
    }
    void reverse(int a[],int j , int i){
        
       // int i=0;
        while(i<j){
            int t=a[i];
            a[i]=a[j];
            a[j]=t;
            i++;j--;
        }
    }
}