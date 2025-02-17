class Solution {
    public int maxProfit(int[] prices) {
        // find the difference between the smallest and the largest, but it should check from left to right
        // so, it should be in increasing order
        if (prices == null || prices.length == 0) return 0;
        int lowest, highest;
        lowest = highest = prices[0];
        int difference=0;
        for(int i=0; i<prices.length; i++){
            if(prices[i]<lowest){
                lowest=prices[i];
                highest=prices[i];
            }
            if(prices[i]>highest){
                highest=prices[i];
            }
            if(difference<highest-lowest) difference = highest-lowest;
        }
        return difference;
    }
}