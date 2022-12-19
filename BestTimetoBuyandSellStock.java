public class BestTimetoBuyandSellStock {
    public int maxProfit(int[] prices) {
        int maxDif = 0;
        int min = prices[0];
        for(int i=0;i<prices.length;i++){
            maxDif = Math.max(prices[i] - min, maxDif);
            min = Math.min(prices[i], min);
        }
        return maxDif;
    }
}
