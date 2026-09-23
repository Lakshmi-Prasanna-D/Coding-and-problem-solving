class Solution {
    public int minProductSum(int[] a, int[] b) {
        // code here
        Arrays.sort(a);
        Arrays.sort(b);
        int n=b.length;
        int i=0, j =n-1;
        while(i<j){
            int t=b[i];
            b[i]=b[j];
            b[j]=t;
            i++;
            j--;
        }
        int sum=0;
        for( i=0;i<n;i++){
            int prod=a[i]*b[i];
            sum+=prod;
        }
        return sum;
    }
}