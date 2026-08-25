class Solution {
    public int maxProfit(int[] prices) {
        int profit=0;
        int buy=prices[0];
        int sell=prices[0];
        for(int x:prices){
          buy=Math.min(x,buy);
          if(x>buy){
            profit=Math.max(profit,x-buy);
          }
        }
        return profit;
    }
}