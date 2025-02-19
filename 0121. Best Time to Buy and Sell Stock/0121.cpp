class Solution {
    public:
        int maxProfit(vector<int>& prices) {
            // find the difference between the smallest and the largest, but it should check from left to right
            int min = prices[0];
            int difference = 0;
            for (int i=1; i<prices.size(); i++){
                // if(difference < prices[i] - min) difference = prices[i] - min;
                difference = max(difference, prices[i]-min);
                if(min > prices[i]) min=prices[i];
            }
            return difference;
        }
    };