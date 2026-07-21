class Solution {
    public int maxProfit(int[] prices) {
        int maxProfit = 0;
        int min = prices[0];

        for(int price : prices){
            if(price < min){
                min = price;
            }

            int curr = price - min;
            if(maxProfit < curr){
                maxProfit = curr;
            }
        }
        return maxProfit;

    }
}
