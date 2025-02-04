class Solution {
public:
    int maxAscendingSum(vector<int>& nums) {
        if (nums.empty()) return 0;

        int best = nums[0];
        int total = nums[0];

        for(int i=1; i<nums.size(); i++){
            if(nums[i]>nums[i-1]){
                total+=nums[i];
            }
            else{
                if (best<total) best=total;
                total = nums[i];
            }
        }
        // return best;
        return (total > best) ? total : best;
    }
};