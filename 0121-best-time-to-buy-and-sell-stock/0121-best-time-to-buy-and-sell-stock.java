class Solution {
    public int maxProfit(int[] prices) {
        int buyPrice = Integer.MAX_VALUE;
        int maxProfit = 0;
        for(int i=0;i<prices.length;i++){
            if(buyPrice > prices[i]){
                 buyPrice = prices[i];//Must be smaller prices there
            }else{
                int profit=prices[i] - buyPrice;//Single profit
                maxProfit=Math.max(maxProfit,profit);//maximum profit
            }
        }
       return maxProfit;
    }
}