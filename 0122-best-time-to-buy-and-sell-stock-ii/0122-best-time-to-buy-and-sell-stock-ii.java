class Solution {
    public int maxProfit(int[] prices) {
        int n=prices.length;
        int buy=prices[n-1];
        int profit=0;
        int sell=prices[n-1];
        for(int i=n-2;i>=0;i--){
            buy=Math.min(buy,prices[i]);
          if(prices[i]>prices[i+1])
             {
                profit+=(sell-buy);
                buy=prices[i];
                sell=prices[i];
             }
        }
        profit+=(sell-buy);
        return profit;
        
    }
}