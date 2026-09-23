class Solution {
    public ArrayList<Integer> minMaxCandy(int[] arr, int k) {
        // code here
        Arrays.sort(arr);
    int n=arr.length;
    int sum=0;
    int temp=n;
    ArrayList<Integer> al=new ArrayList<>();
    for(int i=0;i<temp ;i++){
        sum+=arr[i];
        temp-=k;
    }
    al.add(sum);
    sum=0;
    temp=0;
    for(int i=n-1 ;i >=temp;i--) {sum+=arr[i];
        temp+=k;
    }
    al.add(sum);
    return al;
    }
}
