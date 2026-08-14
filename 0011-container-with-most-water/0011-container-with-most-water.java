class Solution {
    public int maxArea(int[] height) {
        int n=height.length;

        int res=0;
        int l=0, h=n-1;
        while(h!=l){
            res=Math.max(res,(h-l)*Math.min(height[l],height[h]));
            if(height[l]<height[h])
               l++;
            else 
             h--;
        }
        return res;
    }
}