public class L121 {
    public static int maxProfit(int[] prices) {
        int max=0;
        int minSoFar=prices[0];

        for(int i=1 ; i<prices.length ; i++){
            if(prices[i] < minSoFar){
                minSoFar = prices[i];
            }else{
                int profit = prices[i] - minSoFar;
                if(profit > max) max = profit;
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int[] prices = {7, 1, 5, 3, 6, 4};
        int result = maxProfit(prices);
        System.out.println("Maximum profit: " + result);
    }
}
