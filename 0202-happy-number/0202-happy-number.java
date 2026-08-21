class Solution {
    public boolean isHappy(int n) {
        HashSet<Integer> hs=new HashSet<>();
        while(n>1){
            int sum=0;
            while(n!=0){
                int t=n%10;
                t=t*t;
                sum+=t;
                n=n/10;
            }
            if(!hs.contains(sum))
              hs.add(sum);
            else
             return false;
            n=sum;
            sum=0;
        }
        if(n==1)
         return true;
         return false;
    }
}